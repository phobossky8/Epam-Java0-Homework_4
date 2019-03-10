package ldy.java0.hw4.entity;

public class VacationTour extends Tour {
	private String location;

	public VacationTour(double price, int tripDuration, String typeOfTransport, String typeOfNutrition,
			String typeOfApartments, String location) {
		super(price, tripDuration, typeOfTransport, typeOfNutrition, typeOfApartments);
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Vacation tour: price = " + price + ", tripDuration = " + tripDuration + ", typeOfTransport = " + typeOfTransport
				+ ", typeOfNutrition = " + typeOfNutrition + ", typeOfApartments = " + typeOfApartments + ", location = " + location;
	}
	
	
}
