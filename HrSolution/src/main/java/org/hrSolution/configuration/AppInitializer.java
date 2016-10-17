package org.hrSolution.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {
	private static final Logger logger = LoggerFactory.getLogger(AppInitializer.class);
	public void onStartup(ServletContext container) throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.setConfigLocation("org.hrSolution");
		ctx.register(AppConfig.class);
		ctx.setServletContext(container);

		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", new DispatcherServlet(ctx));
		

		servlet.setAsyncSupported(true);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("*.do");
	}
}
