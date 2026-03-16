package com.code.design.section3_oodesign.assignment4_liskov_substitution_principle;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor {
	private String name;
	public EnglishTeacher(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void teach() {
		System.out.println("teach English");
		
	}

}
