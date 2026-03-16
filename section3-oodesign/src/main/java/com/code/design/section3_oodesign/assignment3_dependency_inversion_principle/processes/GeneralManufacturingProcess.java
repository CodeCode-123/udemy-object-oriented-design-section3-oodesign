package com.code.design.section3_oodesign.assignment3_dependency_inversion_principle.processes;

public abstract class GeneralManufacturingProcess {
	private String processName;
	
	public GeneralManufacturingProcess(String processName) {
		super();
		this.processName = processName;
	}
	// template method
	public void launchProcess() {
		if (processName != null && !processName.isEmpty()) {
			assembleDevice();
			testDevice();
			packageDevice();
			storeDevice();
		} else {
			System.out.println("no process name was specified");
		}
	};
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void packageDevice();
	protected abstract void storeDevice();

}
