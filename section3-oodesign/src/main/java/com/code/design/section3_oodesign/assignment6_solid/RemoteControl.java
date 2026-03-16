package com.code.design.section3_oodesign.assignment6_solid;

public class RemoteControl {
	private static Device connectedDevice;

    public static void connectToDevice(Device device) {
        // store connected device
        connectedDevice = device;
    }

    public void pressPowerOn() {
        // call device turnOn
        connectedDevice.turnOn();
    }

    public void pressPowerOff() {
        // call device turnOff
        connectedDevice.turnOff();
    }

}
