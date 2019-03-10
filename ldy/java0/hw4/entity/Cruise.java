package ldy.java0.hw4.entity;

public class Cruise extends Tour {
	private String passingBorder;

	public Cruise(double price, int tripDuration, String typeOfTransport, String typeOfNutrition,
			String typeOfApartments, String passingBorder) {
		super(price, tripDuration, typeOfTransport, typeOfNutrition, typeOfApartments);
		this.passingBorder = passingBorder;
	}

	public String getPassingBorder() {
		return passingBorder;
	}

	public void setPassingBorder(String passingBorder) {
		this.passingBorder = passingBorder;
	}

	@Override
	public String toString() {
		return "Cruise: price = " + price + ", tripDuration = " + tripDuration
				+ ", typeOfTransport = " + typeOfTransport + ", typeOfNutrition = " + typeOfNutrition
				+ ", typeOfApartments = " + typeOfApartments + ", passingBorder = " + passingBorder;
	}
	
	
}
