package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.product.Chair;
import designpatterns.creational.abstractfactory.product.Table;
import designpatterns.creational.abstractfactory.product.VictorianChair;
import designpatterns.creational.abstractfactory.product.VictorianTable;

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
