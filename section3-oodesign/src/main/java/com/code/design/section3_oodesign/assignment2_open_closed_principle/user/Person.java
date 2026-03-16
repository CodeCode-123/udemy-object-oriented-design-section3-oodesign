package com.code.design.section3_oodesign.assignment2_open_closed_principle.user;

import com.code.design.section3_oodesign.assignment2_open_closed_principle.devices.TV;
import com.code.design.section3_oodesign.assignment2_open_closed_principle.remotes.RemoteControl;

public class Person {
	public static void main(String args[]) {
		RemoteControl remote = RemoteControl.getInstance();
		TV tv = new TV();
		remote.connectToDevice(tv);
		remote.clickOnButton();
	}
}
