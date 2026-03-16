package com.code.design.section3_oodesign.assignment4_liskov_substitution_principle;

public class SchoolStaff {
	private String name;
	
	public SchoolStaff(String name) {
		super();
		this.name = name;
	}
	private void makeAnnouncements() {
		System.out.println("made announcements...");
	}
	private void takeAttendence() {
		System.out.println("took attendence...");
	}
	private void collectPaperWork() {
		System.out.println("collected paperwork...");
	}
	private void conductHallwayDuties() {
		System.out.println("conducted hallway duties...");
	}
	public void performOtherResponsibilities() {
		makeAnnouncements();
		takeAttendence();
		collectPaperWork();
		conductHallwayDuties();
	}
}
