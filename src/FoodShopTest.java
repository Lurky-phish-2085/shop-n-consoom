class FoodShopTest {

	public static void main(String[] args) {
		FoodShop fs = new FoodShop("canteen", "canteen for school haha!");

		System.out.println(fs.getName());
		System.out.println(fs.getDescription());

		System.out.println();

		System.out.println("Restock Burger!");
		fs.stockFood(new FoodItem("Burger", "Typical American Fast food meal!", 50));

		System.out.println("Restock Piattos!");
		fs.stockFood(new FoodItem("Piattos", "Crunchy potato chips", 30));

		System.out.println();

		System.out.println("Inventory: " + fs.getInventory());
	}
}
