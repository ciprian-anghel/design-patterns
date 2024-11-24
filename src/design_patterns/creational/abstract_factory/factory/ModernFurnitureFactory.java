package design_patterns.creational.abstract_factory.factory;

import design_patterns.creational.abstract_factory.product.Chair;
import design_patterns.creational.abstract_factory.product.ModernChair;
import design_patterns.creational.abstract_factory.product.ModernTable;
import design_patterns.creational.abstract_factory.product.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Table createTable() {
		return new ModernTable();
	}

}
