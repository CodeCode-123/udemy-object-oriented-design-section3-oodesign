package com.code.design.section3_oodesign.assignment4_liskov_substitution_principle;

public class Main {
	public static void main(String[] args) {
		// create a Math teacher instructor
		CourseInstructor instructor = new MathTeacher("Math teacher");
		instructor.teach();
		// create a substitute teacher staff
		SchoolStaff staff = new SubstituteTeacher("Substitute teacher");
		staff.performOtherResponsibilities();
		// create a science teacher staff
		staff = new ScienceTeacher("Science teacher");
		staff.performOtherResponsibilities();
	}

}
