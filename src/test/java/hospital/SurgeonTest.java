package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
Surgeon underTest = new Surgeon("","","", true);
Patient patient = new Patient();

@Test
public void shouldBeAbleToDrawBlood() { // doc drawing blood will have an effect on pxt
	int bloodLevelBefore = patient.getBloodLevel();
	underTest.drawBlood(patient); // doctor has the ability to draw blood. Draws blood on this particular patient
	int bloodLevelAfter = patient.getBloodLevel();
	assertThat(bloodLevelBefore - bloodLevelAfter, is(5)); // taking into account that every blood draw takes 5
															// units
}
}
