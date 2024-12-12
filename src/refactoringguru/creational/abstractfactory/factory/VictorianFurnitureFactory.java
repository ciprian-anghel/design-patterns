package refactoringguru.creational.abstractfactory.factory;

import refactoringguru.creational.abstractfactory.product.Chair;
import refactoringguru.creational.abstractfactory.product.Table;
import refactoringguru.creational.abstractfactory.product.VictorianChair;
import refactoringguru.creational.abstractfactory.product.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Table createTable() {
		return new VictorianTable();
	}

	
	
}
