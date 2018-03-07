package com.sean.java.design.pattern.singleton;

public class SimpleSingleton {
	private final static SimpleSingleton instance = new SimpleSingleton();
	
	private SimpleSingleton() {
		
	}
	
	public final static SimpleSingleton getInstance() {
		return instance;
	}
	
}
