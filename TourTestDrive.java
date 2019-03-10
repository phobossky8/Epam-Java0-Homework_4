
import java.util.Scanner;
import java.util.logging.Logger;

import ldy.java0.hw4.entity.*;
import ldy.java0.hw4.helper.UserMenu;
import ldy.java0.hw4.logic.ExistingTours;

public class TourTestDrive {
	
	private static final Logger logger = Logger.getLogger(TourTestDrive.class.getName());

	public static void main(String[] args) {		
		 
		ExistingTours existingTours = new ExistingTours();

		Tour seaCruise = new Cruise(250, 5, "Ferry", "Half board", "Cabin", "Europe");
		Tour riverCruise = new Cruise(120, 2, "Ferry", "Half board", "Cabin", "Town");
		Tour oceanCruise = new Cruise(940, 14, "Cruise ship", "Full board", "Cabin", "Athlantic ocean");

		Tour fastShop = new ShoppingTour(40, 1, "Bus", "Room only", "Without staying", "Markets");
		Tour fewDaysShop = new ShoppingTour(110, 3, "Bus", "Room only", "Motel", "Shopping Malls");

		Tour mountainBreath = new HealingTour(380, 10, "Aircraft", "Half board", "3-star hotel", "Mountain air");
		Tour mineralLakes = new HealingTour(320, 8, "Bus", "Half-board", "Motel", "Mineral water");
		Tour therapeticMud = new HealingTour(440, 6, "Aircraft", "Full board", "4-star hotel", "Therapetic mud");

		Tour historicalExcurs = new Excursion(250, 3, "Bus", "Bed & breakfast", "3-star hotel", "Minsk-Warsaw-Prague-Berlin");
		Tour medievalObjects = new Excursion(290, 4, "Aircraft", "Half board", "4-star hotel", "Rome-Athens-Lisbon");
		Tour renaissance = new Excursion(420, 5, "Aircraft", "Half board", "3-star hotel", "Milan-Barcelona-Amsterdam");

		Tour beachTour = new VacationTour(750, 10, "Aircraft", "Full board", "5-star hotel", "Spain");
		Tour skiTour = new VacationTour(450, 7, "Bus", "Half board", "4-star hotel", "Austria");
		Tour hikingTour = new VacationTour(200, 5, "Bus", "Room only", "Tent", "Ukraine");
		Tour safariTour = new VacationTour(330, 4, "Aircraft", "Room only", "Tent", "South Africa");

		existingTours.add(seaCruise);
		existingTours.add(riverCruise);
		existingTours.add(oceanCruise);
		existingTours.add(fastShop);
		existingTours.add(fewDaysShop);
		existingTours.add(mountainBreath);
		existingTours.add(mineralLakes);
		existingTours.add(therapeticMud);
		existingTours.add(historicalExcurs);
		existingTours.add(medievalObjects);
		existingTours.add(renaissance);
		existingTours.add(beachTour);
		existingTours.add(skiTour);
		existingTours.add(hikingTour);
		existingTours.add(safariTour);

		Scanner scanner = new Scanner(System.in);
		boolean process = true;
		System.out.println(System.getProperty("java.util.Logging.config.files"));

		while (process) {
			switch (UserMenu.options(scanner)) {
			case 1: {
				existingTours.showAllTours();
				logger.info("Execute: Query for showing All tours.");
			}
				break;
			case 2: {
				existingTours.sortByPrice();
				logger.info("Execute: Query for showing Sotred list of tours by price.");
			}
				break;
			case 3: {
				existingTours.sortByDays();
				logger.info("Execute: Query for showing Sotred list of tours by duration of tour.");
			}
				break;
			case 4: {
				existingTours.searchByKey();
				logger.info("Execute: Query for showing list of tours by other option.");
			}
				break;
			case 0: {
				process = false;
				System.out.println("Bye-bye! :)");
				logger.info("End of program");
			}
				break;
			}
		}
		scanner.close();
	}
}
