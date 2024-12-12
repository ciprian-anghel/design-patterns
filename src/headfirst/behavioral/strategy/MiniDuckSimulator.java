package headfirst.behavioral.strategy;

import headfirst.behavioral.strategy.behaviours.fly.FlyRocketPowered;
import headfirst.behavioral.strategy.ducks.Duck;
import headfirst.behavioral.strategy.ducks.MallardDuck;
import headfirst.behavioral.strategy.ducks.ModelDuck;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}

}
