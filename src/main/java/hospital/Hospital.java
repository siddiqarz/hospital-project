package hospital;

import java.util.HashMap;
import java.util.Map;

public class Hospital {
	private Map<String, Employee> employees = new HashMap<String, Employee>();

	public void addStaff(Employee employee) {
		employees.put(employee.getEmpNumber(), employee);
	}

	public int staffSize() {
		return employees.size();
	}

	public Employee getStaffByNumber(String empNumber) {
		return employees.get(empNumber);
	}
	//public Collection<Employee> getAllEmployees{
	//return employees.values();
public void showPayRates() {
	for(Employee employee: employees.values()) {
		System.out.println(employee.getEmpName() + " " + employee.paySalary());
	}
}
public void showAllMedPersonnel() {
	for(Employee employee : employees.values()) {
		if(employee instanceof MedicalDuties) { //if an employee can implement medduties
			System.out.println(employee);
		}
	}
}
}
