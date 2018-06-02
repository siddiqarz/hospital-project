package hospital;

public abstract class Employee {
//when a class is made abstract, it cannot have object, so no need for constructors. 
	//We will just have specific type of employees. Child classes become abstract
	
	protected String empNumber;
	protected String empName;

	public String getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public abstract String paySalary(); //using abstract method as not all employees get same salary.
	
	// public Employee() {
	//super(); 
	//default constructor referencing the keyword super, which is it's parent, which is
	// the object of the highest level. Constructor is not needed here because class is abstract
	 //}

}