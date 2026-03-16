package com.code.design.section3_oodesign.lesson9;

public class Vehicle {
	private Engine myEngine;
	
	public Vehicle(Engine anEngine) {
		super();
		this.myEngine = anEngine;
	}
	
	public void crankIgnition() {
		myEngine.startEngine();
		System.out.println("Vehicle is running");
	}

}
