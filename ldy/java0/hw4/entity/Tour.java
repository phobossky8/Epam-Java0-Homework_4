package ldy.java0.hw4.entity;

public class Tour {
	protected double price;
	protected int tripDuration;
	protected String typeOfTransport;
	protected String typeOfNutrition;	
	protected String typeOfApartments;
		
	public Tour(double price, int tripDuration, String typeOfTransport, String typeOfNutrition,
			String typeOfApartments) {
		super();
		this.price = price;
		this.tripDuration = tripDuration;
		this.typeOfTransport = typeOfTransport;
		this.typeOfNutrition = typeOfNutrition;
		this.typeOfApartments = typeOfApartments;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTripDuration() {
		return tripDuration;
	}
	public void setTripDuration(int tripDuration) {
		this.tripDuration = tripDuration;
	}
	public String getTypeOfTransport() {
		return typeOfTransport;
	}
	public void setTypeOfTransport(String typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}
	public String getTypeOfNutrition() {
		return typeOfNutrition;
	}
	public void setTypeOfNutrition(String typeOfNutrition) {
		this.typeOfNutrition = typeOfNutrition;
	}
	public String getTypeOfApartments() {
		return typeOfApartments;
	}
	public void setTypeOfApartments(String typeOfApartments) {
		this.typeOfApartments = typeOfApartments;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tripDuration;
		result = prime * result + ((typeOfApartments == null) ? 0 : typeOfApartments.hashCode());
		result = prime * result + ((typeOfNutrition == null) ? 0 : typeOfNutrition.hashCode());
		result = prime * result + ((typeOfTransport == null) ? 0 : typeOfTransport.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (tripDuration != other.tripDuration)
			return false;
		if (typeOfApartments == null) {
			if (other.typeOfApartments != null)
				return false;
		} else if (!typeOfApartments.equals(other.typeOfApartments))
			return false;
		if (typeOfNutrition == null) {
			if (other.typeOfNutrition != null)
				return false;
		} else if (!typeOfNutrition.equals(other.typeOfNutrition))
			return false;
		if (typeOfTransport == null) {
			if (other.typeOfTransport != null)
				return false;
		} else if (!typeOfTransport.equals(other.typeOfTransport))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tour [price = " + price + ", tripDuration = " + tripDuration + ", typeOfTransport = " + typeOfTransport
				+ ", typeOfNutrition = " + typeOfNutrition + ", typeOfApartments = " + typeOfApartments + "]";
	}
	
	
	
}