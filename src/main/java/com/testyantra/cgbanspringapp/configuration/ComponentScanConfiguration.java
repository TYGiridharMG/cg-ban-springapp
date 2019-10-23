package com.testyantra.cgbanspringapp.configuration;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//scans for the beans by @componentScan in the specified package
@Configuration
@ComponentScan(basePackages = "com.testyantra.cgbanspringapp.di")
@Import(SpringCoreConfiguration.class)
public class ComponentScanConfiguration {
	
	@Bean
	public BeanFactoryPostProcessor getBeanFactoryPostProcessor() {
		return new FactoryPostProcesserClass();
	}
	
	@Bean
	public BeanPostProcessor getBeanPostProcessor() {
		return new PostProcesserClass();
	}
}






