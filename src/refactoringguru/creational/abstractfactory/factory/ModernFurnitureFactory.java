package refactoringguru.creational.abstractfactory.factory;

import refactoringguru.creational.abstractfactory.product.Chair;
import refactoringguru.creational.abstractfactory.product.ModernChair;
import refactoringguru.creational.abstractfactory.product.ModernTable;
import refactoringguru.creational.abstractfactory.product.Table;

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
