package ldy.java0.hw4.comparators;

import java.util.Comparator;

import ldy.java0.hw4.entity.*;

public class DaysComparator implements Comparator<Tour> {

	@Override
	public int compare(Tour tour1, Tour tour2) {
		if (tour1.getTripDuration() > tour2.getTripDuration()) {
			return 1;
		}
		if (tour1.getTripDuration() < tour2.getTripDuration()) {
			return -1;
		}
		return 1;
	}

}
