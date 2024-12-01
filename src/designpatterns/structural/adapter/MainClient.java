package designpatterns.structural.adapter;

import designpatterns.structural.adapter.adapter.SquarePieceAdapter;
import designpatterns.structural.adapter.round.RoundHole;
import designpatterns.structural.adapter.round.RoundPiece;
import designpatterns.structural.adapter.square.SquarePiece;

/*
 * Also known as: WRAPPER
 *
 * Intent:	
 * 		Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 * 		Fits square piece into round hole.
 * 
 * Applicability:
 * 		Use the Adapter class when you want to use some existing class, 
 * 		but its interface isn’t compatible with the rest of your code.
 * 
 * Solution:
 * 		You can create an adapter. This is a special object that converts the interface of one object 
 * 		so that another object can understand it.
 * 
 * 		An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes. 
 * 		The wrapped object isn’t even aware of the adapter. For example, you can wrap an object that operates 
 * 		in meters and kilometers with an adapter that converts all of the data to imperial units such as feet 
 * 		and miles.
 * 
 * 		Adapters can not only convert data into various formats but can also help objects with different 
 * 		interfaces collaborate. 
 * 
 * Here’s how it works:
 * 		1. The adapter gets an interface, compatible with one of the existing objects.
 * 		2. Using this interface, the existing object can safely call the adapter’s methods.
 * 		3. Upon receiving a call, the adapter passes the request to the second object, 
 * 		   but in a format and order that the second object expects.
 */

public class MainClient {
	
	public static void main(String[] args) {
		RoundHole roundHole = new RoundHole(10);
		RoundPiece roundPiece = new RoundPiece(8);
		if (roundHole.fits(roundPiece)) {
			System.out.println(String.format(
					"Round piece with radius %f fits in round hole with radius %f.", 
					roundPiece.getRadius(), roundHole.getRadius()));
		}
		
		System.out.println("Round piece fits in round hole: " + roundHole.fits(roundPiece));
		
		SquarePiece smallSquare = new SquarePiece(2);
		SquarePiece largeSquare = new SquarePiece(20);
		// This wont compile due to incompatible types
		// roundHole.fits(smallSquare));
		
		SquarePieceAdapter smallAdaptor = new SquarePieceAdapter(smallSquare);
		SquarePieceAdapter largeAdaptor = new SquarePieceAdapter(largeSquare);
		if (roundHole.fits(smallAdaptor)) {
			System.out.println(String.format(
					"Square piece with width %d firs round hole with radius %f", 
					smallSquare.getWidth(), roundHole.getRadius()));
		}
		
		if (roundHole.fits(largeAdaptor)) {
			System.out.println(String.format(
					"Square piece with width %d firs round hole with radius %f", 
					largeSquare.getWidth(), roundHole.getRadius()));
		}
	}
	
}
