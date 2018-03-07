package com.sean.java.design.pattern.prototype;

import java.io.Serializable;

public class Wheel implements Cloneable, Serializable {
	private static final long serialVersionUID = 629638065132124941L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public boolean equals(Object obj) {
    	if(obj instanceof Wheel) {
    		String objName = ((Wheel)obj).getName();
    		if(objName == null) {
    			return this.getName() == null;
    		} else {
    			return objName.equals(this.getName());
    		}
    	}
        return false;
    }

	public Wheel clone() {
		try {
			return (Wheel) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
