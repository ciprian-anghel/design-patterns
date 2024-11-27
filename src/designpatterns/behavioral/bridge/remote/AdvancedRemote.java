package designpatterns.behavioral.bridge.remote;

import designpatterns.behavioral.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super(device);
	}
	
	public void mute() {
		System.out.println("Sound muted");
		device.setVolume(0);
	}

}
