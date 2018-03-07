package com.sean.java.design.pattern.singleton;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {
	public void testSimpleSingleton() {
		assertEquals(SimpleSingleton.getInstance(), SimpleSingleton.getInstance());
	}
	
	public void testLazySingleton() {
		assertEquals(LazySingleton.getInstance(), LazySingleton.getInstance());
	}
	
	public void testPerfectSingleton() {
		assertEquals(PerfectSingleton.getInstance(), PerfectSingleton.getInstance());
	}

}
