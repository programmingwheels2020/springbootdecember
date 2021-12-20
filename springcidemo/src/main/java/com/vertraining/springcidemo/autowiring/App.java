package com.vertraining.springcidemo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/vertraining/springcidemo/autowiring/config.xml");
       
       //Addition add = (Addition) ctx.getBean("addition");
       
       Book book = (Book) ctx.getBean("book");
       
       System.out.println(book);
       //ctx.registerShutdownHook();
      
    }
}
