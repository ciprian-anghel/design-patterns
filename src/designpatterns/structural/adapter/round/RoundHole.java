package designpatterns.structural.adapter.round;

//Say you have two classes with compatible interfaces:
// - RoundHole 
// - RoundPeg
public class RoundHole {
	private double radius;
	
	public RoundHole(int radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public boolean fits(RoundPiece peg) {
		return this.getRadius() >= peg.getRadius();
	}
}