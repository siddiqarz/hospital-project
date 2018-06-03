package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class JanitorTest {
	Janitor testJanitor = new Janitor("567", "Loki", false);
@Test
public void shouldBeAbleToReturnName() {
	testJanitor.getEmpName();
}
@Test
public void shouldBeAbleToCalcPay() {
	String check = testJanitor.paySalary();
	assertEquals(check,"40000");
}
@Test 
public void shouldBeAbleToTellIfSweeping(){
	assertFalse(testJanitor.ifIsSweeping());
}

}
