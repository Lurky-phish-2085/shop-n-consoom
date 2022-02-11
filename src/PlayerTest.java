import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) {

		Player p1 = new Player("Dan", 50);
		FoodShop fs = new FoodShop("Angel's Burger", "Masarap yummy");

		fs.stockFood(new FoodItem("Burger", "N/A", 25));
		fs.stockFood(new FoodItem("Hotdoge", "N/A", 15));

		System.out.println("FoodShop stock: " + fs.getInventory() + "\n");

		System.out.println(p1.getName() + " has to buy to FoodShop...");
		System.out.println("He have " + p1.getMoney() + " to spend...\n");
		System.out.println("His current inventory: " + p1.getInventory() + "\n");

		Scanner in = new Scanner(System.in);

		System.out.println("He will buy Burger...");

		System.out.println("Press enter to continue...\n");
		in.nextLine();

		p1.buy(fs.getInventory().get(0), fs.getInventory().get(0).getPrice());

		System.out.println("He got the Burger now!\n");
		System.out.println("His current inventory: " + p1.getInventory() + "\n");
		System.out.println("He have " + p1.getMoney() + " left...\n");

		System.out.println("He will buy Hotdoge...");

		System.out.println("Press enter to continue...\n");
		in.nextLine();

		p1.buy(fs.getInventory().get(1), fs.getInventory().get(1).getPrice());

		System.out.println("He got the Hotdoge now!\n");
		System.out.println("His current inventory: " + p1.getInventory() + "\n");
		System.out.println("He have " + p1.getMoney() + " left...\n");

		System.out.println("Press enter to continue...\n");
		in.nextLine();

		System.out.println("He will leave FoodShop now!");
		System.out.println("THE END");

	}

}
