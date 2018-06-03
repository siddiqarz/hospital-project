package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
	Surgeon underTest = new Surgeon("2", "", "", true);
	Patient patient = new Patient();

	@Test
	public void shouldBeAbleToDrawBlood() { // doc drawing blood will have an effect on pxt
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient); // doctor has the ability to draw blood. Draws blood on this particular patient
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5)); // taking into account that every blood draw takes 5 //
																// units
	}

	@Test
	public void shouldIncreaseHealthLevel() {

		int healthLevelBefore = patient.getHealthLevel();
		underTest.treatPatient(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(5));
	}

	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "2");
	}
	@Test
	public void shouldGetPaid120k() {
		assertEquals(underTest.paySalary(), "120000");
	}
	@Test
	public void checkIfOperating() {
		boolean check = underTest.isOperating();
		assertEquals(check, true);
	}
}
