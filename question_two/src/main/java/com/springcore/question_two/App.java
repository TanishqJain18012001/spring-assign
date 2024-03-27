package com.springcore.question_two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/question_two/config.xml");
        question2 obj1 = (question2) context.getBean("question2");
        System.out.println(obj1);
    }
}