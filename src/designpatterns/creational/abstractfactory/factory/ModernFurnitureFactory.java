package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.product.Chair;
import designpatterns.creational.abstractfactory.product.ModernChair;
import designpatterns.creational.abstractfactory.product.ModernTable;
import designpatterns.creational.abstractfactory.product.Table;

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
