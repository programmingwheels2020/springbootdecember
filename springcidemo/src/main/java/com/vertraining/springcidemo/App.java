package com.vertraining.springcidemo;

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
       ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vertraining/springcidemo/config.xml");
       
       Book book = (Book) ctx.getBean("bookone");
       
       System.out.println(book);
    }
}
