package headfirst.behavioral.state.state;

//Contains methods for each action of a gumball machine
public interface State {

	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	
}
