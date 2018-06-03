package hospital;

public class Janitor extends Employee{
	private boolean isSweeping;
	
public Janitor(String empNum, String empName, boolean isSweeping) {
	this.empName=empName;
	this.empNumber=empNum;
	this.isSweeping = isSweeping;
}
	@Override
	public String paySalary() {
		
		return "40000";
	}
public boolean ifIsSweeping() {
	return isSweeping;
}
}
