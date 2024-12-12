package refactoringguru.structural.bridge.remote;

import refactoringguru.structural.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super(device);
	}
	
	public void mute() {
		System.out.println("Sound muted");
		device.setVolume(0);
	}

}
