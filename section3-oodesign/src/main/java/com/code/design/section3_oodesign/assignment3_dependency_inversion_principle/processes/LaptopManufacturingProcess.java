package com.code.design.section3_oodesign.assignment3_dependency_inversion_principle.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {	
	private String processName;
	
	public LaptopManufacturingProcess(String processName) {
		super(processName);
		this.processName = processName;
	}

	@Override
	protected void assembleDevice() {
		System.out.println("Assemble device: " + processName);
	}

	@Override
	protected void testDevice() {
		System.out.println("Test device: " + processName);
	}

	@Override
	protected void packageDevice() {
		System.out.println("Package device: " + processName);
	}

	@Override
	protected void storeDevice() {
		System.out.println("Store device: " + processName);
	}
}
