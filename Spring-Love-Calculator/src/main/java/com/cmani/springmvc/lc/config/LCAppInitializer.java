package com.cmani.springmvc.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classes = {LoveCalculatorAppConfig.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappingArr = {"/myWebsite.com/*"};
		return mappingArr;
	}

}
