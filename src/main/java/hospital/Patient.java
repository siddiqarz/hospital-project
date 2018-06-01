package hospital;

public class Patient {

	private static final int DEFAULT_HEALTH_LEVEL = 10;
	private static final int DEFAULT_BLOOD_LEVEL = 20; // created a constant, right click the number, extract constant,
														// name in all CAPS
	private int bloodLevel = DEFAULT_BLOOD_LEVEL; // default blood level
	private int healthLevel = DEFAULT_HEALTH_LEVEL;

	//accessors
	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	//methods of behavior
	public void removeBlood(int amount) {
		bloodLevel -= amount;
	}

	public void treat(int amount) {
		healthLevel += amount;

	}

}
