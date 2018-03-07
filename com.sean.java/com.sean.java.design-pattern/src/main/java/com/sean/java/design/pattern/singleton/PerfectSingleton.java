package com.sean.java.design.pattern.singleton;

public class PerfectSingleton {
	private PerfectSingleton() {
		
	}
	
	private static class PerfectSingletonHolder {
		private final static PerfectSingleton instance = new PerfectSingleton();
	}
	
	public final static PerfectSingleton getInstance() {
		return PerfectSingletonHolder.instance;
	}
}
