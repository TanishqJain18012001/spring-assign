package com.springcore.q_three;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Drawing {
	
	private question1 triangle;	
	
	@Autowired
	public void setTriangle(question1 triangle) {
		this.triangle = triangle;
	}	
	public void draw() {
		System.out.println(triangle.getType());
	}
}
