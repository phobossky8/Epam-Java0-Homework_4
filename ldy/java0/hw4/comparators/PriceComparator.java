package ldy.java0.hw4.comparators;

import java.util.Comparator;

import ldy.java0.hw4.entity.*;

public class PriceComparator implements Comparator<Tour> {

	@Override
	public int compare(Tour tour1, Tour tour2) {
		if (tour1.getPrice() > tour2.getPrice()) {
			return 1;
		}
		if (tour1.getPrice() < tour2.getPrice()) {
			return -1;
		}
		return 1;
	}

}
