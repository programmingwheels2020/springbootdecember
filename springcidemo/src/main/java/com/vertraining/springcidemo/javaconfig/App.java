package com.vertraining.springcidemo.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */


public class App 
{
    private static String[] beanDefinitionNames;

    
	public static void main( String[] args )
    {
       //AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/vertraining/springcidemo/javaconfig/config.xml");
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);
       Book book = (Book) ctx.getBean("book");
       
       System.out.println(book);
       //ctx.registerShutdownHook();
       /*
       beanDefinitionNames = ctx.getBeanDefinitionNames();
       
       for(String names:beanDefinitionNames) {
    	   System.out.println(names);
       }
       
       System.out.println("---------------");*/
      
    }
}
