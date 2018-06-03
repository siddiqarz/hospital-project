package hospital;

public interface MedicalDuties {
//Refactor, extract interface, check the methods that should be included (treatPatient, drawBlood)
	void drawBlood(Patient patient);

	void treatPatient(Patient patient);

}