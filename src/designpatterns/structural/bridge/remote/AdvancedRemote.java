package designpatterns.structural.bridge.remote;

import designpatterns.structural.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super(device);
	}
	
	public void mute() {
		System.out.println("Sound muted");
		device.setVolume(0);
	}

}
