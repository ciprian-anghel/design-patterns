package headfirst.behavioral.state;

import headfirst.behavioral.state.state.HasQuarterState;
import headfirst.behavioral.state.state.NoQuarterState;
import headfirst.behavioral.state.state.SoldOutState;
import headfirst.behavioral.state.state.SoldState;
import headfirst.behavioral.state.state.State;
import headfirst.behavioral.state.state.WinnerState;

public class GumballMachine {
	
	private State soldOutState = new SoldOutState(this);
	private State noQuarterState = new NoQuarterState(this);
	private State hasQuarterState = new HasQuarterState(this);
	private State soldState = new SoldState(this);
	private State winnerState = new WinnerState(this);
	
	private State state = noQuarterState;
	private int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}
	
	public String toString() {
		return "Gumball Machine State: " + state.getClass().getSimpleName();
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
	public int getCount() {
		return this.count;
	}
	
}
