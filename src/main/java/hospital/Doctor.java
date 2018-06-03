package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;

	public Doctor(String empNumber, String empName, String specialty)// created constructor accepting strings
	{
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty = specialty;
	}

	@Override //good practice to use override whenever you're changing a method that has been declared and comes from somewhere else. 
	//You're changing the results of this method.
	public void drawBlood(Patient patient) {
		patient.removeBlood(5); // remove an amount of blood

	}

	@Override
	public void treatPatient(Patient patient) {
		patient.treat(5);

	}
	public String getSpecialty() {
		return specialty;
	}
	@Override
	public String paySalary() {
		return "90000";
	}

}
