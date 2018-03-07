package com.sean.java.design.pattern.singlefactory;

import com.sean.java.design.pattern.domain.Car;
import com.sean.java.design.pattern.exception.NotFoundException;

public class CarFactory {
	public static Car createCar(String name) throws NotFoundException {
		try {
			Class<Car> cls = (Class<Car>) Class.forName(name);
			return cls.newInstance();
		} catch (ClassNotFoundException e) {
			throw new NotFoundException(String.format("Car %s not found.", name));
		} catch (InstantiationException | IllegalAccessException e) {
			throw new NotFoundException(String.format("Car %s not found. Root cause(%s)", name,e.getMessage()));
		}
	}
}
