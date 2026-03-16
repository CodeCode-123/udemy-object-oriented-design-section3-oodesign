package com.code.design.section3_oodesign.assignment2_open_closed_principle.devices;

public class Projector implements Device {

	@Override
	public void turnOn() {
		System.out.println("This projector is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("This projector is turned off.");
	}
	
	@Override
	public String toString() {
		return "Projector";	
	}
}
