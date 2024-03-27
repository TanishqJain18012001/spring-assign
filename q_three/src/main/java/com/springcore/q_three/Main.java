package com.springcore.q_three;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {      
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/q_three/config.xml");
        Drawing drawing = context.getBean(Drawing.class);
        drawing.draw();
    }
}