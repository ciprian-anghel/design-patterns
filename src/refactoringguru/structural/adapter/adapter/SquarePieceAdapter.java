package refactoringguru.structural.adapter.adapter;

import refactoringguru.structural.adapter.round.RoundPiece;
import refactoringguru.structural.adapter.square.SquarePiece;

//An adapter class lets you fit square pieces into round holes.
//It extends the RoundPiece class to let the adapter objects act
//as round pegs.

// From SquarePiece to RoundPiece

//Extends the target object (since you need its methods)
//and wraps the source object that needs to be 'adapted'
public class SquarePieceAdapter extends RoundPiece {

	private SquarePiece squarePiece;
	
	public SquarePieceAdapter(SquarePiece piece) {
		this.squarePiece = piece;
	}
	
	@Override
	public double getRadius() {
		return Math.sqrt(Math.pow((squarePiece.getWidth() / 2), 2) * 2);
	}

}
