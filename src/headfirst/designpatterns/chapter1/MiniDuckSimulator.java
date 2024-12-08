package headfirst.designpatterns.chapter1;

import headfirst.designpatterns.chapter1.behaviours.fly.FlyRocketPowered;
import headfirst.designpatterns.chapter1.ducks.Duck;
import headfirst.designpatterns.chapter1.ducks.MallardDuck;
import headfirst.designpatterns.chapter1.ducks.ModelDuck;

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
