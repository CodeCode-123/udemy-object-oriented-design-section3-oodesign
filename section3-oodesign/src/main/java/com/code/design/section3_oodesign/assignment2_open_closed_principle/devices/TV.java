package com.code.design.section3_oodesign.assignment2_open_closed_principle.devices;

public class TV implements Device {

	@Override
	public void turnOn() {
		System.out.println("This TV is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("This TV is turned off.");
	}
	
	@Override
	public String toString() {
		return "TV";	
	}

}
