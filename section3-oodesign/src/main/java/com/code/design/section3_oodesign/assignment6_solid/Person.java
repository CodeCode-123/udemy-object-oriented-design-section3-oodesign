package com.code.design.section3_oodesign.assignment6_solid;

public class Person {
	private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void playing() {
        System.out.println(this.firstName + " " + this.lastName + " now playing");
    }
    public static void main(String[] args) {
        // Create devices, connect, and control them via RemoteControl
        RemoteControl remote = new RemoteControl();
        TV tv = new TV();
        Projector projector = new Projector();
        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();
    
        RemoteControl.connectToDevice(tv);
        remote.pressPowerOn();
        remote.pressPowerOff();
        
        RemoteControl.connectToDevice(projector);
        remote.pressPowerOn();
        remote.pressPowerOff();
        
        RemoteControl.connectToDevice(surroundSoundSystem);
        remote.pressPowerOn();
        remote.pressPowerOff();
    }

}
