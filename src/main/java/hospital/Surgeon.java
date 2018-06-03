package hospital;

public class Surgeon extends Doctor { // changed from extends employee and implements MedicalDuties
	private boolean isOperating;

	public Surgeon(String empNum, String empName, String specialty, boolean isOperating) {
		super(empNum, empName, specialty); // Make doctor the super class, brings in variables from the constructor of
											// parent. Maps what is inside of doctor.
	this.isOperating=isOperating;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);

	}

	@Override
	public void treatPatient(Patient patient) {
		patient.treat(5);

	}

	@Override
	public String paySalary() {
//Overriding salary that comes from doc
		return "120000";
	}

	public Boolean isOperating() {
		return isOperating;
	}
}