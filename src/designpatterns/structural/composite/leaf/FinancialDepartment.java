package designpatterns.structural.composite.leaf;

import designpatterns.structural.composite.component.Department;

public class FinancialDepartment implements Department {

	private Integer id;
	private String name;
	
	@Override
	public void printDepartmentName() {
		System.out.println(name + " (" + id + ")");
	}

	public FinancialDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
