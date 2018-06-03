package hospital;

public class HospitalApp {
	public static void main(String[] args) {

		Hospital hospital = new Hospital();

		Doctor phil = new Doctor("1", "Phil", "Brain");
		Surgeon harry = new Surgeon("2", "Harry", "Brain", true);
		Nurse jackie = new Nurse("3", "Jackie", 5);
		Receptionist janine = new Receptionist("4", "Janine", true);
		Janitor rosie = new Janitor("5", "Rosie", true);

		hospital.addStaff(phil);
		hospital.addStaff(harry);
		hospital.addStaff(jackie);
		hospital.addStaff(janine);
		hospital.addStaff(rosie);

		System.out.println("Here are the salary rates at the hospital: ");
		hospital.showPayRates();
		System.out.println("Here are the employees who can give medical treatment: ");
		hospital.showAllMedPersonnel();
	}
}