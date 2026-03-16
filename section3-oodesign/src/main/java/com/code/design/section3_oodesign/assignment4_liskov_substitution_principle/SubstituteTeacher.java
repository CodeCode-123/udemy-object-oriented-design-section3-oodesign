package com.code.design.section3_oodesign.assignment4_liskov_substitution_principle;

public class SubstituteTeacher extends SchoolStaff {
	private String name;

	public SubstituteTeacher(String name) {
		super(name);
		this.name = name;
	}

}
