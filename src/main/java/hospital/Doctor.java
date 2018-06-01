package hospital;

public class Doctor {

	private String empNumber;
	private String empName;
	private String specialty;

	public Doctor(String empNumber, String empName, String specialty)// created constructor accepting strings
	{
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty = specialty;
	}

	public void drawBlood(Patient patient) {
		patient.removeBlood(5); // remove an amount of blood

	}

	public void treatPatient(Patient patient) {
		patient.treat(5);

	}

	public String getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		// TODO Auto-generated method stub
		return empName;
	}

	public String getSpecialty() {

		return specialty;
	}

}
