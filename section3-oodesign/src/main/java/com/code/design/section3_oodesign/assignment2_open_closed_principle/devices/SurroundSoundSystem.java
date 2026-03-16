package com.code.design.section3_oodesign.assignment2_open_closed_principle.devices;

public class SurroundSoundSystem implements Device {

	@Override
	public void turnOn() {
		System.out.println("This surround sound system is turned on.");	
	}

	@Override
	public void turnOff() {
		System.out.println("This surround sound system is turned off.");
	}
	
	@Override
	public String toString() {
		return "Surround sound system";
	}
}
