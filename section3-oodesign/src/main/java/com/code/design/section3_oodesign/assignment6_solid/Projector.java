package com.code.design.section3_oodesign.assignment6_solid;

public class Projector implements Device {
	// implement turnOn and turnOff
    @Override
    public void turnOn() {
        lowerScreen();
        System.out.println("Projector has been turned on");
    }
    @Override
    public void turnOff() {
        raiseScreen();
        System.out.println("Projector has been turned off");
    }
    public void lowerScreen() {
        System.out.println("Screen has been lowered for viewing");
    }
    public void raiseScreen() {
        System.out.println("Screen raised back up to close");
    }

}
