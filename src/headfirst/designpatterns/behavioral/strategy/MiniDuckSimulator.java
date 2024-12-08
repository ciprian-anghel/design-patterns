package headfirst.designpatterns.behavioral.strategy;

import headfirst.designpatterns.behavioral.strategy.behaviours.fly.FlyRocketPowered;
import headfirst.designpatterns.behavioral.strategy.ducks.Duck;
import headfirst.designpatterns.behavioral.strategy.ducks.MallardDuck;
import headfirst.designpatterns.behavioral.strategy.ducks.ModelDuck;

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
