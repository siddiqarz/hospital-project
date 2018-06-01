package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
	Doctor underTest = new Doctor("1", "Joe", "peds");
	// instance variables required: Employee number, name and Specialty area
	// test on state verification (variables e.g blood drawn)
	Patient patient = new Patient();

	@Test
	public void shouldBeAbleToDrawBlood() { // doc drawing blood will have an effect on pxt
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient); // doctor has the ability to draw blood. Draws blood on this particular patient
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5)); // taking into account that every blood draw takes 5
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
		assertEquals(check, "1");
	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "Joe");
	}

@Test
public void shouldReturnSpecialty() {
	String check = underTest.getSpecialty();
	assertEquals(check, "peds");
	
}
}