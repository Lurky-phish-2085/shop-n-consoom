public class FoodShop extends Shop {

	public FoodShop(String name, String description) {
		super(name, description);
	}

	public void stockFood(FoodItem food) {
		getInventory().add(food);
	}

}
