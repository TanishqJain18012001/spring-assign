package com.springcore.question_two;

public class question2 {

	private int base;
	private int height;
	private String bgcolor;
	
	public int getbase() {
		return base;
	}
	public void setbase(int base) {
		this.base = base;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getBgcolor() {
		return bgcolor;
	}
	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}
	
	public question2(int base, int height, String bgcolor) {
		super();
		this.base = base;
		this.height = height;
		this.bgcolor = bgcolor;
	}
	
	public question2() {
		super();
	}
	
	@Override
	public String toString() {
		return "question 2:\n[base=" + base + ", height=" + height + ", bgcolor=" + bgcolor + "]";
	}
}
