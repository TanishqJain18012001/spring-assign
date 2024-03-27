package com.springcore.question5;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Period> periods;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        this.periods = new ArrayList<>();
    }

    public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
	        return id;
	}
	public String getName() {
	        return name;
	}

	public void setperiods(List<Period> periods) {
		this.periods = periods;
	}

    public List<Period> getperiods() {
        return periods;
    }

	
}