package designpatterns.behavioral.adapter.adapter;

import designpatterns.behavioral.adapter.round.RoundPiece;
import designpatterns.behavioral.adapter.square.SquarePiece;

//An adapter class lets you fit square pieces into round holes.
//It extends the RoundPiece class to let the adapter objects act
//as round pegs.

// From SquarePiece to RoundPiece
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
