package com.sean.java.design.pattern.abstractfactory;

import com.sean.java.design.pattern.domain.Benz;
import com.sean.java.design.pattern.domain.BenzSuv;
import com.sean.java.design.pattern.domain.Car;
import com.sean.java.design.pattern.domain.Suv;

public class BenzFactory implements AbstractFactory {

	@Override
	public Car createCar() {
		return new Benz();
	}

	@Override
	public Suv createSuv() {
		return new BenzSuv();
	}

}
