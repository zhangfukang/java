package com.sean.java.design.pattern.factorymethod;

import com.sean.java.design.pattern.domain.Audi;
import com.sean.java.design.pattern.domain.Benz;
import com.sean.java.design.pattern.factorymethod.AudiFactory;
import com.sean.java.design.pattern.factorymethod.BenzFactory;
import com.sean.java.design.pattern.factorymethod.Factory;

import junit.framework.TestCase;

public class FactoryTest extends TestCase {
	public void testCreateAudi() {
		Factory factory = new AudiFactory();
		assertEquals(Audi.class, factory.createCar().getClass());
	}

	public void testCreateBenz() {
		Factory factory = new BenzFactory();
		assertEquals(Benz.class, factory.createCar().getClass());
	}
}
