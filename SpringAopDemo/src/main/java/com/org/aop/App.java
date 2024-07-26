package com.org.aop;


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
        AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ActorRepository a1 = a.getBean(ActorRepository.class);
        MovieRepository m1 = a.getBean(MovieRepository.class);
        a1.add("hritik");
        a1.delete(null);
        m1.add(null);
        
    }
}
