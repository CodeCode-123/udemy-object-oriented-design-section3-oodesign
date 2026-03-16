package com.code.design.section3_oodesign.assignment6_solid;

public class TV implements Device {
	// implement turnOn and turnOff
    @Override
    public void turnOn() {
        switchToFavoriteChannel();
        System.out.println("TV has been turned on");
        setAlarm();
    }
    @Override
    public void turnOff() {
        System.out.println("TV has been turned off");
    }
    public void setAlarm() {
        System.out.println("TV Alarm set for you to wake up in the morning");
    }
    public void switchToFavoriteChannel() {
        System.out.println("Switched to your favorite Channel");
    }

}
