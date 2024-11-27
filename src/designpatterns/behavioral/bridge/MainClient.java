package designpatterns.behavioral.bridge;

import designpatterns.behavioral.bridge.devices.Radio;
import designpatterns.behavioral.bridge.devices.Television;
import designpatterns.behavioral.bridge.remote.AdvancedRemote;
import designpatterns.behavioral.bridge.remote.BasicRemote;

/*
 * This is basically composition using abstraction
 * 
 * Intent:
 * 		Bridge is a structural design pattern that lets you split a large class
 * 		or a set of closely related classes into two separate hierarchies—abstraction 
 * 		and implementation which can be developed independently of each other.
 * 
 * Applicability:
 * 		Use the Bridge pattern when you want to divide and organize a monolithic class 
 * 		that has several variants of some functionality (for example, if the class can work
 * 		with various database servers).
 * 	
 * 		Use the Bridge if you need to be able to switch implementations at runtime.
 */
public class MainClient {

	public static void main(String[] args) {
		System.out.println("--- Tests with basic remote ---");
		Television tv = new Television();
		BasicRemote tvRemote = new BasicRemote(tv);
		tvRemote.power();
		tvRemote.volumeUp();
		tvRemote.volumeUp();
		tvRemote.volumeUp();
		tvRemote.volumeUp();
		tvRemote.volumeUp();
		tvRemote.volumeUp();
		tvRemote.channelUp();
		tvRemote.channelUp();
		tvRemote.power();
		
		tv.printStatus();
		
		System.out.println("--- Tests with advanced remote ---");
		Radio radio = new Radio();
		AdvancedRemote radioRemote = new AdvancedRemote(radio);
		radioRemote.power();
		radioRemote.volumeDown();
		radioRemote.mute();
		radioRemote.power();
		
		radio.printStatus();
	}
	
}
