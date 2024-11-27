package designpatterns.behavioral.adapter.square;

public class SquarePiece {
	private int width;
	
	public SquarePiece(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public double getSquare() {
		return Math.pow(this.width, 2);
	}
}