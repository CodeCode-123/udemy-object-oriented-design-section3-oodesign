package com.code.design.section3_oodesign.lesson9;

public class App {
	public static void main(String[] args) {
		Vehicle raceCar = new Vehicle(new SmallEngine(100));
		raceCar.crankIgnition();
		raceCar = new Vehicle(new LargeEngine(500));
		raceCar.crankIgnition();
	}

}
