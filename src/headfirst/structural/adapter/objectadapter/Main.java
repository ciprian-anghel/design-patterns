package headfirst.structural.adapter.objectadapter;

import headfirst.structural.adapter.objectadapter.adapter.TurkeyAdapter;
import headfirst.structural.adapter.objectadapter.from.Duck;
import headfirst.structural.adapter.objectadapter.from.MallardDuck;
import headfirst.structural.adapter.objectadapter.to.WildTurkey;

public class Main {

	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		//Adapt the turkey to a duck
		Duck turkeyDressedAsDuckAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says ...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says ...");
		duck.quack();
		duck.fly();
		
		System.out.println("\nThe TurkeyAdapter says ...");
		turkeyDressedAsDuckAdapter.quack();
		turkeyDressedAsDuckAdapter.fly();
		
	}
	
}
