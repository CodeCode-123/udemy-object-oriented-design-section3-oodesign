package com.code.design.section3_oodesign.assignment2_open_closed_principle.remotes;

import com.code.design.section3_oodesign.assignment2_open_closed_principle.devices.Device;

public class RemoteControl {
	private Device device;
	private static final RemoteControl INSTANCE = new RemoteControl();
	private RemoteControl() {
	}
	public static RemoteControl getInstance() {
		return INSTANCE;
	}
	public void connectToDevice(Device device) {
		this.device = device;
		System.out.println("The device is connected: " + device.toString());
	}
	public void clickOnButton() {
		device.turnOn();
	}
	public void clickOffButton() {
		device.turnOff();
	}
}
