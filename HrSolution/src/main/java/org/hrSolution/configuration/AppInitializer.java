package org.hrSolution.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * This class works as web.xml, which is used for scanning base package
 * registering dispatcher servlet
 * load on startup
 * url mapping 
 *  
 * */
/**
 * @author lalchand Mali
 *
 */
public class AppInitializer implements WebApplicationInitializer {

	private static final Logger logger = LoggerFactory
			.getLogger(AppInitializer.class);

	/**
	 * This is the main entry point of application
	 * */
	public void onStartup(ServletContext container) throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.setConfigLocation("org.hrSolution");
		ctx.register(AppConfig.class);
		ctx.setServletContext(container);

		/**
		 * Adding dispatcher servlet to container
		 * */
		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", new DispatcherServlet(ctx));

		servlet.setAsyncSupported(true);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("*.do");
		logger.debug(" successfully loaded configuration ");
	}
}
