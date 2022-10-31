package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configXML.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println("Student name from Spring Context is: " + student.getName());
        System.out.println("Student lastNAME from Spring Context is: " + student.getLastName());
        System.out.println(student.toString());


    }
}
