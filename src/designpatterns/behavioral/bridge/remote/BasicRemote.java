package designpatterns.behavioral.bridge.remote;

import designpatterns.behavioral.bridge.devices.Device;

public class BasicRemote implements Remote {

	protected Device device;
	
	public BasicRemote(Device device) {
		this.device = device;
	}
	
	@Override
	public void power() {
		if (device.isEnabled()) {
			device.disable();
			System.out.println("Turning off");
		} else {
			device.enable();
			System.out.println("Turning on");
		}
	}

	@Override
	public void volumeDown() {
		device.setVolume(device.getVolume() - 10);
		System.out.println("Decrease volume to " + device.getVolume());
	}

	@Override
	public void volumeUp() {
		device.setVolume(device.getVolume() + 10);
		System.out.println("Increase volume to " + device.getVolume());
	}

	@Override
	public void channelDown() {
		device.setChannel(device.getChannel() - 1);
		System.out.println("Change channel down to " + device.getChannel());
	}

	@Override
	public void channelUp() {
		device.setChannel(device.getChannel() + 1);
		System.out.println("Change channel up to " + device.getChannel());
	}
	

}
