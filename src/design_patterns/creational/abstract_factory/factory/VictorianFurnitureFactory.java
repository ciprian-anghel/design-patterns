package design_patterns.creational.abstract_factory.factory;

import design_patterns.creational.abstract_factory.product.Chair;
import design_patterns.creational.abstract_factory.product.Table;
import design_patterns.creational.abstract_factory.product.VictorianChair;
import design_patterns.creational.abstract_factory.product.VictorianTable;

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
