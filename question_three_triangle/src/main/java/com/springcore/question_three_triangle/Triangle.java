package com.springcore.question_three_triangle;
import org.springframework.beans.factory.annotation.Autowired;

public class Triangle {

	@Autowired
	private Triangle_Info obj;

	public Triangle_Info getAddress() {
		return obj;
	}
	public void setAddress(Triangle_Info address) {
		this.obj = obj;
	}

	public Triangle() {
		super();
	}
	public Triangle(Triangle_Info obj) {
		super();
		this.obj = obj;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return " Triangle_Info [" + obj + "]";
	}	
}
