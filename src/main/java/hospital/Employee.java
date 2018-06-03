package hospital;

public abstract class Employee {
	// Refactor, extract superclass: select the employees that were created and the
	// common properties(variables and accessors).
	// when a class is made abstract, it cannot have object, so no need for
	// constructors.
	// There will be no objects created of type Employee
	// We will just have specific type of employees. Child classes become abstract

	protected String empNumber;	
	protected String empName;

	public String getEmpNumber() {
		return empNumber;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	//instead of this, can do an employee.getName() in Hospital Class

	public String getEmpName() {
		return empName;
	}

	public abstract String paySalary(); // using abstract method as not all employees get same salary.

	// public Employee() {
	// super();
	// default constructor referencing the keyword super, which is it's parent,
	// which is
	// the object of the highest level. Constructor is not needed here because class
	// is abstract
	// }

}