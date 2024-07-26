package com.org.tcs1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.tcs1.bean.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("First Maven project ");
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Manager m = (Manager) app.getBean("manager");
        m.doWork();
       
        
    }
}
