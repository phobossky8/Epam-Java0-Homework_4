package ldy.java0.hw4.logic;

import ldy.java0.hw4.comparators.*;
import ldy.java0.hw4.entity.Tour;
import ldy.java0.hw4.helper.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ExistingTours {

	private PriceComparator priceComparator = new PriceComparator();
	private DaysComparator daysComparator = new DaysComparator();

	private List<Tour> existingTours = new ArrayList<>();
	private TreeSet<Tour> sortedByPrice = new TreeSet<>(priceComparator);
	private TreeSet<Tour> sortedByDays = new TreeSet<>(daysComparator);

	public ExistingTours() {
		existingTours = new ArrayList<>();
	}

	public List<Tour> getExistingTours() {
		return existingTours;
	}

	public void setExistingTours(List<Tour> existingTours) {
		this.existingTours = existingTours;
	}

	public void add(Tour obj) {
		existingTours.add(obj);
	}

	public void showAllTours() {
		for (int i = 0; i < existingTours.size(); i++) {
			System.out.println(existingTours.get(i).toString());
			System.out.println("");
		}
	}

	public void sortByPrice() {
		for (Tour n : existingTours) {
			sortedByPrice.add(n);
		}
		for (Tour n : sortedByPrice) {
			System.out.println(n);
			System.out.println(" ");
		}
	}

	public void sortByDays() {
		for (Tour t : existingTours) {
			sortedByDays.add(t);
		}
		for (Tour t : sortedByDays) {
			System.out.println(t);
			System.out.println(" ");
		}
	}

	public void searchByKey() {

		Scanner scanner = new Scanner(System.in);
		switch (AdditionalMenu.addOptions(scanner)) {
		case 1: {
			System.out.print("Enter number to find: ");
			double key = scanner.nextDouble();
			for (Tour n : existingTours) {
				if (n.getPrice() == key || n.getTripDuration() == key) {
					System.out.println(n);
				}
			}
			System.out.println(" ");
			// logger.info(Constants.END_TEXT);
		} break;

		case 2: {
			System.out.println("Enter keyword to find: ");
			String keyWords = scanner.nextLine();

			for (Tour t : existingTours) {
				if (t.getTypeOfApartments().toLowerCase().contains(keyWords.toLowerCase())) {
					System.out.println(t);
				} else if (t.getTypeOfNutrition().toLowerCase().contains(keyWords.toLowerCase())) {
					System.out.println(t);
				} else if (t.getTypeOfTransport().toLowerCase().contains(keyWords.toLowerCase())) {
					System.out.println(t);
				}
			}
			System.out.println(" ");

		} break;

		}

	}
}
