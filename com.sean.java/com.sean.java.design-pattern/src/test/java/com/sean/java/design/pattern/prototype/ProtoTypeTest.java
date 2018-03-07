package com.sean.java.design.pattern.prototype;

import junit.framework.TestCase;

public class ProtoTypeTest extends TestCase {
	public void testClone() {
		Wheel wheel = new Wheel();
		Wheel cloneWheel = wheel.clone();
		assertTrue(wheel != cloneWheel);
		assertTrue(wheel.equals(cloneWheel));
	}

	public void testDeepClone() {
		Car car = new Car();
		Wheel wheel = new Wheel();
		car.setWheel(wheel);
		Car cloneCar = car.clone();
		assertTrue(car != cloneCar);
		assertFalse(car.equals(cloneCar));
		assertTrue(car.getWheel() == cloneCar.getWheel());
		
		Car deepCloneCar = car.deepClone();
		assertTrue(car != deepCloneCar);
		assertFalse(car.equals(deepCloneCar));
		assertTrue(car.getWheel() != deepCloneCar.getWheel());
		assertTrue(car.getWheel().equals(deepCloneCar.getWheel()));
	}
}
