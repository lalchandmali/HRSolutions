package org.hrSolution.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.Doc;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.hrSolution.model.EmployeeDetailModel;
import org.hrSolution.model.HrSolutionsDocToFillModel;
import org.hrSolution.service.WordTemplateService;
import org.hrSolution.status.constant.CommonParamConstant;
import org.hrSolution.status.constant.PreEmployeeDocVarConstant;
import org.springframework.stereotype.Service;

@Service("wordTemplateService")
public class WordTemplateImpl implements WordTemplateService {
	private static final Logger logger = LogManager
			.getLogger(WordTemplateImpl.class);
	// creation of HashMap
	Map<String, String> employeeDoc = new HashMap<String, String>();

	/**
	 * This method is used to fill document template by information provided by
	 * pre employee
	 * 
	 * @return boolean
	 * @return true if successfully filled document template otherwise @return
	 *         false if any exception or error occurred
	 * 
	 * */
	public boolean employeeDocFill(
			HrSolutionsDocToFillModel hrSolutionsDocToFillModel) {

		InputStream fs = null;
		try {
			/**
			 * Retrieving Employee Detail object from hrSolutionsDocToFillModel
			 * */
			EmployeeDetailModel empDetailModel = hrSolutionsDocToFillModel
					.getEmpDetails();
			// inserting data into hashMap
			insert(hrSolutionsDocToFillModel);
			/**
			 * Extracting useful data from Employee Detail Model
			 * */
			String mail = empDetailModel.getEmployeeMail();
			String mailExtract[] = mail.split("@");
			String domainName=mailExtract[1];
			String mailDomain = domainName.substring(0, domainName.indexOf("."));

			/**
			 * Creating FileInput Stream Object for reading Company Template
			 * */

			fs = new FileInputStream(CommonParamConstant.TEMPLATE_DOC_PATH
					+ empDetailModel.getCompanyId() + "/document/"
					+ empDetailModel.getCompanyId() + ".docx");

			XWPFDocument doc = new XWPFDocument(OPCPackage.open(fs));
			System.out.println(empDetailModel);
			for (XWPFParagraph p : doc.getParagraphs()) {
				List<XWPFRun> runs = p.getRuns();
				if (runs != null) {
					for (XWPFRun r : runs) {
						String text = r.getText(0);
						if (text != null && text.contains("{")){
							String str=text.trim();
							String key="{"+str.substring(str.indexOf("{")+1,str.indexOf("}"))+"}";
							if(employeeDoc.containsKey(key)) {							
							String replace = str.replace(key, employeeDoc.get(key));
							r.setText(replace.toUpperCase(), 0);
							}
						}
					}
				}
			}
			for (XWPFTable tbl : doc.getTables()) {
				for (XWPFTableRow row : tbl.getRows()) {
					for (XWPFTableCell cell : row.getTableCells()) {
						for (XWPFParagraph p : cell.getParagraphs()) {
							for (XWPFRun r : p.getRuns()) {
								String text = r.getText(0);
								if (text != null && text.contains("{")){
									String str=text.trim();
									String key="{"+str.substring(str.indexOf("{")+1,str.indexOf("}"))+"}";
									if(employeeDoc.containsKey(key)) {							
									String replace = str.replace(key, employeeDoc.get(key));
									r.setText(replace.toUpperCase(), 0);
									}
								}
							}
						}
					}
				}
			}
			doc.write(new FileOutputStream(new File(
					"/home/lalchand/Desktop/"+mailExtract[0]+"_"+mailDomain+".docx")));
			// out.flush();
			// out.close();
		} catch (Exception e) {
			logger.debug("Exception Occured Reason: " + e.getMessage());
			e.printStackTrace();
			return Boolean.FALSE;
		}finally{
			try {
				fs.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				logger.debug(e.getMessage());
			}
		}
		return Boolean.TRUE;
	}

	/**
	 * This Method is used to insert data into hashMap from
	 * hrSolutionsDocToFillModel
	 * 
	 * @throws IllegalAccessException
	 * @throws Exception
	 * */
	@SuppressWarnings("unchecked")
	public void insert(HrSolutionsDocToFillModel hrSolutionsDocToFillModel)
			throws Exception {
		Class<?> objClass = hrSolutionsDocToFillModel.getClass();
		Class<?> objClass1 = hrSolutionsDocToFillModel.getEmpDetails().getClass();
		Map<String, String> variables = PreEmployeeDocVarConstant
				.getDocVariables();
		Field[] fields = objClass.getDeclaredFields();
		
		Field[] fields2=objClass1.getDeclaredFields();
		
		for (Field field : fields) {
		    field.setAccessible(true);
			String name = field.getName();
			Object value = field.get(hrSolutionsDocToFillModel);
			if(variables.containsKey(name)){
				employeeDoc.put(variables.get(name), value.toString());
			}
		}
			for (Field field1 : fields2) {
			    field1.setAccessible(true);
				String name1 = field1.getName();
				Object value1 = field1.get(hrSolutionsDocToFillModel.getEmpDetails());
				if(variables.containsKey(name1)){
					employeeDoc.put(variables.get(name1), value1.toString());
				}
			}

		

	}
}
