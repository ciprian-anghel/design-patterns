package design_patterns.creational.abstract_factory.factory;

import design_patterns.creational.abstract_factory.product.Chair;
import design_patterns.creational.abstract_factory.product.Table;

public interface FurnitureFactory {
	
	Chair createChair();
	Table createTable();

}
