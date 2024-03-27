package com.springcore.question4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {     
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Triangle triangle = (Triangle) context.getBean(Triangle.class);
        triangle.setBase(15);
        triangle.setHeight(12);
        triangle.draw();
        context.close();
    }
}
