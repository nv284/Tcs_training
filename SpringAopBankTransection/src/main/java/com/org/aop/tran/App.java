package com.org.aop.tran;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
		ApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConf.class);
        BankingService bankingService = app.getBean(BankingService.class);

        bankingService.deposit(1, 100.0);
        bankingService.withdraw(1, 50.0);
        
    }
}
