package hospital;

public class Receptionist extends Employee {
	private boolean isOnPhone;

	public Receptionist(String empNum, String empName, boolean isOnPhone) {
		this.empNumber = empNum;
		this.empName = empName;
		this.isOnPhone = isOnPhone;
	}

	@Override
	public String paySalary() {
		return "45000";
	}

	public boolean ifIsOnPhone() {

		return isOnPhone;
	}

}
