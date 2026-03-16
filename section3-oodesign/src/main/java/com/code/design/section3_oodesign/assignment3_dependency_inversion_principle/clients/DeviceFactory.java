package com.code.design.section3_oodesign.assignment3_dependency_inversion_principle.clients;

import com.code.design.section3_oodesign.assignment3_dependency_inversion_principle.processes.GeneralManufacturingProcess;
import com.code.design.section3_oodesign.assignment3_dependency_inversion_principle.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String[] args) {
		GeneralManufacturingProcess process = new SmartphoneManufacturingProcess("Iphone");
		process.launchProcess();
	}

}
