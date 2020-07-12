package com.cmani.springmvc.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer /* implements WebApplicationInitializer */ {

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Initialization of Love Calculator Config !");
		
		//XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		//webApplicationContext.setConfigLocation("classpath:application-servlet.xml");
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic customServletDispatcher = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		customServletDispatcher.setLoadOnStartup(1);
		customServletDispatcher.addMapping("/myWebsite.com/*");

	}

}
