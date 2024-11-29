package designpatterns.behavioral.composite.composite;

import java.util.ArrayList;
import java.util.List;

import designpatterns.behavioral.composite.component.Department;

/*
 * Composite class 
 * 		holds a collection of Department components, 
 * 		as well as methods for adding and removing elements from the list.
 */
public class HeadDepartment implements Department {

	private Integer id;
    private String name;
	
    private List<Department> childDepartments;
    
    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }
    
	@Override
	public void printDepartmentName() {
		System.out.println("--- " + name + " (" + id + ")" + " ---");
		childDepartments.forEach(Department::printDepartmentName);
	}
	
	public void addDepartment(Department department) {
		childDepartments.add(department);
	}
	
	public void removeDepartment(Department department) {
		childDepartments.remove(department);
	}

}
