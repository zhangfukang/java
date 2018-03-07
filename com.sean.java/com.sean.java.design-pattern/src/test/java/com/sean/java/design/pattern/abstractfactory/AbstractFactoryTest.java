package com.sean.java.design.pattern.abstractfactory;

import com.sean.java.design.pattern.domain.Audi;
import com.sean.java.design.pattern.domain.AudiSuv;
import com.sean.java.design.pattern.domain.Benz;
import com.sean.java.design.pattern.domain.BenzSuv;

import junit.framework.TestCase;

public class AbstractFactoryTest extends TestCase {
	public void testCreateAudi() {
		AbstractFactory abstractFactory = new AudiFactory();
		assertEquals(Audi.class, abstractFactory.createCar().getClass());
		assertEquals(AudiSuv.class, abstractFactory.createSuv().getClass());
	}

	public void testCreateBenz() {
		AbstractFactory abstractFactory = new BenzFactory();
		assertEquals(Benz.class, abstractFactory.createCar().getClass());
		assertEquals(BenzSuv.class, abstractFactory.createSuv().getClass());
	}
}
