package ldy.java0.hw4.entity;

public class HealingTour extends Tour {
	private String healingSource;

	public HealingTour(double price, int tripDuration, String typeOfTransport, String typeOfNutrition,
			String typeOfApartments, String healingSource) {
		super(price, tripDuration, typeOfTransport, typeOfNutrition, typeOfApartments);
		this.healingSource = healingSource;
	}

	public String getHealingSource() {
		return healingSource;
	}

	public void setHealingSource(String healingSource) {
		this.healingSource = healingSource;
	}

	@Override
	public String toString() {
		return "Healing Tour: price = " + price + ", tripDuration = " + tripDuration
				+ ", typeOfTransport = " + typeOfTransport + ", typeOfNutrition = " + typeOfNutrition
				+ ", typeOfApartments = " + typeOfApartments + ", healingSource = " + healingSource;
	}
	
	
}
