
import entity.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

	static Scanner in = new Scanner(System.in);
	static Random random = new Random();

	static Player p1;
	static FoodShop foodShop = new FoodShop("7-11 24/7 Shop", "Convience store for anyone!");
	static List<FoodItem> foodItems = new ArrayList<>();

	public static void clearScreen() {
		System.out.println("\033[H\033[J");
	}

	private static void welcomeMessage() {
		System.out.println("Welcome to Shop-n-consoom BETA!\n");
	}

	private static void initializePlayer() {
		System.out.println("We have to know you first!\n");

		int i = 0;
		while (true) {
			if (i == 0) {
				System.out.print("Enter your name: ");
			} else {
				System.out.print("\nEnter your name: ");
			}

			String name = in.nextLine();
		
			System.out.print("Is " + name + " correct? [y/n] ");
			if (in.nextLine().equalsIgnoreCase("y")) {
				p1 = new Player(name, 50);
				break;
			}

			i++;
		}
	}

	private static void showPlayerStatus() {
		System.out.println("=========================");
		System.out.println("NAME: " + p1.getName());
		System.out.println("MONEY: " + p1.getMoney());
		System.out.println("\nHUNGER: " + p1.getHungerLevel());
		System.out.println("THIRST: " + p1.getThirstLevel());
		System.out.println("=========================");
	}

	private static void loadItems() {
		foodItems.add(new FoodItem("Piatos Cheese flavor", "Cheese powdered potato chips", 25, 5));
		foodItems.add(new FoodItem("Nogger", "Choco goodness!", 12, 2));
		foodItems.add(new FoodItem("Siopao Daga", "fresh from the wild rats in soft buns", 50, 15));
		foodItems.add(new FoodItem("Chicken Meal", "Fried chicken yummy!", 70, 25));
	}

	private static void stockFoodShops() {
		for (FoodItem food : foodItems) {
			foodShop.stockFood(food);
		}
	}

	private static void playerInventory() {
		clearScreen();
		showPlayerStatus();

		System.out.println("\n" + p1.getName().toUpperCase() + "'s INVENTORY");
		System.out.println("=========================");

		for (int i = 0; i < p1.getInventory().size(); i++) {
			System.out.println((i + 1) + ". " + p1.getInventory().get(i));
		}

		System.out.println("=========================");

		System.out.println("\nPress Enter to go back!");
		in.nextLine();
	}

	private static void earnMoney() {
		clearScreen();
		showPlayerStatus();

		int salary = random.nextInt(10);
		p1.setMoney(p1.getMoney() + salary);
		System.out.println("\nYou went to a weird part-time job...");
		System.out.println("You earned " + salary + " pesos!");

		System.out.println("\nPress Enter to go back!");
		in.nextLine();
	}

	private static void mainMenu() throws InterruptedException {
		while (true) {
			clearScreen();
			showPlayerStatus();

			System.out.println("\n1. Buy Food");
			System.out.println("2. Open your Inventory");
			System.out.println("3. Earn some money");
			System.out.println("0. Quit Game\n");

			System.out.print("> ");

			switch (in.nextLine()) {
				case "1":
				       // food
				       break;
				case "2":
				       playerInventory();
				       break;
				case "3":
				       earnMoney();
				       break;
				case "0":
					System.out.print("Are you sure to quit? [y/n]: ");
					if (in.nextLine().equalsIgnoreCase("y")) {
						System.out.println("Thank you for playing!");
						System.exit(0);
					}
					break;
				default:
					System.out.println("No such option!");
					Thread.sleep(250l);
					break;
			}
		}
	}

	public static void play() throws InterruptedException {

		// The first stage is to get know the player first
		clearScreen();

		welcomeMessage();
		initializePlayer();

		System.out.println("\nPLAYER SUMMARY");
		showPlayerStatus();

		// After that the game would now transition to gameplay
		System.out.println("\nYou are about to embark into consumerism!");
		System.out.println("Enjoy!");
		System.out.println("\nPlease wait...");

		loadItems();
		stockFoodShops();

		Thread.sleep(3000l);	// to let the player read the message above
		clearScreen();

		// The gameplay starts
		mainMenu();
	}
}

		/**
		 *
		 * # The main flow
		 *
		 * 1. You have choices of actions
		 * 2. If you choose one, it will take you to the action
		 * 3. Actions:
		 *
		 * - Open Player's Inventory
		 * - Go to the FoodShop
		 * - Go take a Job to earn money (random cash)
		 * - Quit the game
		 *
		 * 4. We can also go back to the main menu to choose another actions
		 * 5. Opening an Inventory will show a UI for the list of things you have
		 * 6. Going to the Foodshop will show UI also, along with another menus
		 *    same as the Inventory also.
		 *
		 * 7. You can also see the current state of your Player
		 *    you will see the hunger level and the thirst and money also.
		 *
		 * # B4 the flow
		 *
		 * 1. We have to initialize the Player's credentials first before the game.
		 * 2. Load the Items and Shops would have in the game
		 *
		 */
