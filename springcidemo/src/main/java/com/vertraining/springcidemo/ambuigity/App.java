package com.vertraining.springcidemo.ambuigity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vertraining/springcidemo/ambuigity/config.xml");
       
       //Addition add = (Addition) ctx.getBean("addition");
       
       Book book = (Book) ctx.getBean("book");
       
       System.out.println(book);
    }
}
