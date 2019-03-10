package ldy.java0.hw4.entity;

public class Excursion extends Tour {
	private String route;

	public Excursion(double price, int tripDuration, String typeOfTransport, String typeOfNutrition,
			String typeOfApartments, String route) {
		super(price, tripDuration, typeOfTransport, typeOfNutrition, typeOfApartments);
		this.route = route;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "Excursion: price = " + price + ", tripDuration = " + tripDuration
				+ ", typeOfTransport = " + typeOfTransport + ", typeOfNutrition = " + typeOfNutrition
				+ ", typeOfApartments = " + typeOfApartments + ", route = " + route;
	}
	
	
}
