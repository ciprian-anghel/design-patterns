package design_patterns.creational.builder.product;

public class Car {
	
	private boolean gps;
	private boolean computer;
	private boolean electricSeats;
	private int seats;
	private int doors;
	
	public Car() {}
	
	public boolean isGps() {
		return gps;
	}
	public void setGps(boolean gps) {
		this.gps = gps;
	}
	public boolean isComputer() {
		return computer;
	}
	public void setComputer(boolean computer) {
		this.computer = computer;
	}
	public boolean isElectricSeats() {
		return electricSeats;
	}
	public void setElectricSeats(boolean electricSeats) {
		this.electricSeats = electricSeats;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Car: [")
				.append("gps: " + gps + "; ")
				.append("computer: " + computer + "; ")
				.append("electricSeats: " + electricSeats + "; ")
				.append("seats: " + seats + "; ")
				.append("doors: " + doors)
				.append("]")
				.toString();
	}
	
}
