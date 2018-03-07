package com.sean.java.design.pattern.singlefactory;

import com.sean.java.design.pattern.domain.Audi;
import com.sean.java.design.pattern.domain.Benz;
import com.sean.java.design.pattern.exception.NotFoundException;

import junit.framework.TestCase;

public class CarFactoryTest extends TestCase {
	public void testCreateCar() {
		try {
			assertEquals(Audi.class, CarFactory.createCar(Audi.class.getName()).getClass());
			assertEquals(Benz.class, CarFactory.createCar(Benz.class.getName()).getClass());
		} catch (NotFoundException e) {
			fail(e.getErrorMsg());
		}
		try {
			assertNotNull(CarFactory.createCar("unknown"));
			fail("unknow is not a car");
		} catch (NotFoundException e) {
		}
	}

}
