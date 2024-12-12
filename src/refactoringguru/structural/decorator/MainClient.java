package refactoringguru.structural.decorator;

import refactoringguru.structural.decorator.component.DataSource;
import refactoringguru.structural.decorator.component.FileDataSource;
import refactoringguru.structural.decorator.decorators.DataSourceDecorator;
import refactoringguru.structural.decorator.decorators.EncryptionDecorator;

/*
 * Also known as
 * 		Wrapper
 * 
 * Intent
 * 		Decorator is a structural design pattern that lets you attach new behaviors to objects by
 * 		placing these objects inside special wrapper objects that contain the behaviors.
 * 
 * Applicability
 * 		Use the Decorator pattern when you need to be able to assign extra behaviors to objects 
 * 		at runtime without breaking the code that uses these objects.
 */
public class MainClient {

	public static void main(String[] args) {
		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		String fileName = "out/OutputDemo.txt";
		
		DataSource dsComponent = new FileDataSource(fileName);
		DataSourceDecorator encryptionWrapper = new EncryptionDecorator(dsComponent);
		encryptionWrapper.writeData(salaryRecords); //Write encrypted data to file
		
		DataSource plainComponent = new FileDataSource(fileName);

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(plainComponent.readData()); //Read existing encrypted data from file
		System.out.println("- Decoded --------------");
		System.out.println(encryptionWrapper.readData()); //Decrypt data from file
	}

}
