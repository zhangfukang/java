package com.sean.java.design.pattern.abstractfactory;

import com.sean.java.design.pattern.domain.Car;
import com.sean.java.design.pattern.domain.Suv;

public interface AbstractFactory {
	public Car createCar();
	
	public Suv createSuv();
}
