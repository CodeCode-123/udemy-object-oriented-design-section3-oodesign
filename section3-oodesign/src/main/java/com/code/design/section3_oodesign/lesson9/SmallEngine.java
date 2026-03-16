package com.code.design.section3_oodesign.lesson9;

public class SmallEngine implements Engine {
	private int horsePower;
	public SmallEngine(int horsePower) {
		super();
		this.horsePower = horsePower;
	}

	@Override
	public void startEngine() {
		System.out.println("started small " + horsePower + "hp engine");
	}

}
