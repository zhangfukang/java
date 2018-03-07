package com.sean.java.design.pattern.factorymethod;

import com.sean.java.design.pattern.domain.Benz;
import com.sean.java.design.pattern.domain.Car;

public class BenzFactory implements Factory {

	@Override
	public Car createCar() {
		return new Benz();
	}

}
