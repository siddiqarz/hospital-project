package hospital;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {
	Hospital underTest;
	Doctor testDoc;
	Nurse testNurse;

	@Before
	public void setUp() {
		underTest = new Hospital();
		testDoc = new Doctor("2321", "Joe", "");
		testNurse = new Nurse("1234", "mary", 1);
	}

	@Test
	public void shouldBeAbleToAddStaff() {
		// Set up
		// Act
		int staffCountBefore = underTest.staffSize();
		underTest.addStaff(testDoc);
		//Collection<Employee> check = hospital.getAllEmployees();
		// Assert
		//AssertThat(check, contains(testDoc)
		assertEquals(staffCountBefore + 1, underTest.staffSize());
	}

	@Test
	public void shouldBeAbleToAddDiffKindsOfEmployees() {
		// Act
		underTest.addStaff(testDoc);
		underTest.addStaff(testNurse);

		// Assert
		assertThat(testDoc, instanceOf(Employee.class));
		assertThat(testNurse, instanceOf(Employee.class));
		//Collection<Employee> check = hospital.getAllAmployees();
		//assertThat(check, containsInAnyOrder(testDoc, testNurse))
	}

	@Test
	public void shouldBeAbleToGetEmployeesByNumber() {
		// Arrange
		// Act
		underTest.addStaff(testDoc);
		underTest.addStaff(testNurse);

		Employee hiredDoc = underTest.getStaffByNumber(testDoc.getEmpNumber());
		Employee hiredNurse = underTest.getStaffByNumber(testNurse.getEmpNumber());

		System.out.println("Test: " + testNurse.getEmpNumber());
		System.out.println("Hired: " + hiredNurse.getEmpNumber());
		// Assert
		assertEquals(testDoc.getEmpNumber(), hiredDoc.getEmpNumber());
		assertEquals(testNurse.getEmpNumber(), hiredNurse.getEmpNumber());
		assertNotEquals(testDoc.getEmpNumber(), testNurse.getEmpNumber());
	}
}
