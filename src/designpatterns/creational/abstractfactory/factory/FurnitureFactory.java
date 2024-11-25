package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.product.Chair;
import designpatterns.creational.abstractfactory.product.Table;

public interface FurnitureFactory {
	
	Chair createChair();
	Table createTable();

}
