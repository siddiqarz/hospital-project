package hospital;

public class Surgeon extends Employee implements MedicalDuties{
public Surgeon (String empNum, String empName, String specialty, boolean operating) {
	
}

@Override
public void drawBlood(Patient patient) {
	patient.removeBlood(5);
	
}

@Override
public void treatPatient(Patient patient) {
	// TODO Auto-generated method stub
	
}

@Override
public String paySalary() {
	
	return "120000";
}
}