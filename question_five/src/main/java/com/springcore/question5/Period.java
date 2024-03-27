package com.springcore.question5;

public class Period {
    private int id;
    private String name;

    public Period(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}    
}