package com.springcore.question_three_triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireTest {
	
	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/question_three_triangle/autowiringconfig.xml");
		Triangle triangle_info = (Triangle) context.getBean("triangle");			
		System.out.println(triangle_info);
	}
}
 