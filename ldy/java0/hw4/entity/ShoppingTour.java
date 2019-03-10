package ldy.java0.hw4.entity;

public class ShoppingTour extends Tour {
	private String typeOfShops;

	public ShoppingTour(double price, int tripDuration, String typeOfTransport, String typeOfNutrition,
			String typeOfApartments, String typeOfShops) {
		super(price, tripDuration, typeOfTransport, typeOfNutrition, typeOfApartments);
		this.typeOfShops = typeOfShops;
	}

	public String getTypeOfShops() {
		return typeOfShops;
	}

	public void setTypeOfShops(String typeOfShops) {
		this.typeOfShops = typeOfShops;
	}

	@Override
	public String toString() {
		return "Shopping Tour: price = " + price + ", tripDuration = " + tripDuration
				+ ", typeOfTransport = " + typeOfTransport + ", typeOfNutrition = " + typeOfNutrition
				+ ", typeOfApartments = " + typeOfApartments + ", typeOfShops = " + typeOfShops;
	}
	
	
}
