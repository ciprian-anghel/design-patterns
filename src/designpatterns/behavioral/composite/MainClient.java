package designpatterns.behavioral.composite;

import designpatterns.behavioral.composite.component.Department;
import designpatterns.behavioral.composite.composite.HeadDepartment;
import designpatterns.behavioral.composite.leaf.FinancialDepartment;
import designpatterns.behavioral.composite.leaf.SalesDepartment;

/*
 * Also known as
 * 		Object Tree
 * 
 * Intent
 * 		Composite is a structural design pattern that lets you compose objects into tree structures 
 * 		and then work with these structures as if they were individual objects.
 * 
 * Applicability
 * 		Use the Composite pattern when you have to implement a tree-like object structure.
 * 
 * 		Use the pattern when you want the client code to treat both simple and complex elements uniformly.
 * 
 * Break down
 * 		component - base interface for all objects in the composition.
 * 		leaf - implements the default behaviour of the base component
 * 		composite - has leaf elements. Implements the base component methods and defines the child-related operations
 * 		client - has access to the composition elements by using the base component object
 * 		
 */
public class MainClient {

	public static void main(String[] args) {
		
		SalesDepartment salesDep1 = new SalesDepartment(1, "Sales 1");
		SalesDepartment salesDep2 = new SalesDepartment(2, "Sales 2");
		
		HeadDepartment headLevel1 = new HeadDepartment(3, "Head Level 1");
		headLevel1.addDepartment(salesDep1);
		headLevel1.addDepartment(salesDep2);
		
		FinancialDepartment financialDep1 = new FinancialDepartment(4, "Financial 1");
		SalesDepartment salesDep3 = new SalesDepartment(4, "Sales 3");
		
		HeadDepartment headLevel2 = new HeadDepartment(5, "Head Level 2");
		headLevel2.addDepartment(financialDep1);
		headLevel2.addDepartment(salesDep3);
		headLevel2.addDepartment(headLevel1);
		
		headLevel2.printDepartmentName();
	}
	
}
