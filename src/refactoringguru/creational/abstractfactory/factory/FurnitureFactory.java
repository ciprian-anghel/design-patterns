package refactoringguru.creational.abstractfactory.factory;

import refactoringguru.creational.abstractfactory.product.Chair;
import refactoringguru.creational.abstractfactory.product.Table;

public interface FurnitureFactory {
	
	Chair createChair();
	Table createTable();

}
