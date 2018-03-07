package com.sean.java.design.pattern.abstractfactory;

import com.sean.java.design.pattern.domain.Audi;
import com.sean.java.design.pattern.domain.AudiSuv;
import com.sean.java.design.pattern.domain.Car;
import com.sean.java.design.pattern.domain.Suv;

public class AudiFactory implements AbstractFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

	@Override
	public Suv createSuv() {
		return new AudiSuv();
	}

}
