package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist testReceptionist = new Receptionist("583", "Josh", true);

	@Test
	public void shouldBeAbleToReturnName() {
		testReceptionist.getEmpName();
	}

	@Test
	public void shouldBeAbleToCalcPay() {
		String check = testReceptionist.paySalary();
		assertEquals(check, "45000");
	}

	@Test
	public void shouldBeAbleToTellIfIsOnPhone() {
		assertTrue(testReceptionist.ifIsOnPhone());
	}

}
