package com.springcore.question4;
import java.util.Random;

public class Triangle {
	private int base;
	private int height;
		 
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	

	public void draw() {
		
		System.out.println("Base :" + base + " Height: " + height);
		Random rand = new Random();
        int delay = rand.nextInt(100);
        try {
        	System.out.println("Delay : "+ delay + " milliseconds");
            Thread.sleep(delay);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}