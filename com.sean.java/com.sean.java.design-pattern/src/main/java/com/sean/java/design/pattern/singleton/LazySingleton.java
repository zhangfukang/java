package com.sean.java.design.pattern.singleton;

public class LazySingleton {
	private static LazySingleton instance;
	
	private LazySingleton() {
		
	}
	
	public final static LazySingleton getInstance() {
		if(instance == null) {
			synchronized (LazySingleton.class) {
				if(instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
