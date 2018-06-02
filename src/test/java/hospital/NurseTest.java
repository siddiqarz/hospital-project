package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	Nurse underTest = new Nurse("2", "Jack", 1); // employee#, empName, #of patients.
	Patient patient = new Patient();

	@Test
	public void shouldBeAbleToDrawBlood() { // doc drawing blood will have an effect on pxt
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient); // doctor has the ability to draw blood. Draws blood on this particular patient
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5)); // taking into account that every blood draw takes 5
																// units
	}

	public String paySalary() {
		return "50000";
	}

	@Test
	public void shouldIncreaseHealthLevel() {

		int healthLevelBefore = patient.getHealthLevel();
		underTest.treatPatient(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(3));
	}

	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "2");
	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "Jack");
	}

	@Test
	public void shouldReturnNumberOfPatients() {
		int check = underTest.getNumPatients();
		assertEquals(check, 1);
	}
	@Test
	public void shouldGetPaid50k() {
		String check = underTest.paySalary();
		assertEquals(check, "50,000");
	}
}