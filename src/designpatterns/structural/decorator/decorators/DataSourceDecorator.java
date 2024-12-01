package designpatterns.structural.decorator.decorators;

import designpatterns.structural.decorator.component.DataSource;

/*
 * Base decorator, follows the same interface as the decorated class
 */
public abstract class DataSourceDecorator implements DataSource {

	private DataSource wrappee;
	
	DataSourceDecorator(DataSource source) {
		this.wrappee = source;
	}
	
	 @Override
	 public void writeData(String data) {
		 wrappee.writeData(data);
	 }
	 
	 @Override
	 public String readData() {
		 return wrappee.readData();
	 }
	
}
