package com.sean.java.design.pattern.factorymethod;

import com.sean.java.design.pattern.domain.Audi;
import com.sean.java.design.pattern.domain.Car;

public class AudiFactory implements Factory {
	@Override
	public Car createCar() {
		return new Audi();
	}
}
