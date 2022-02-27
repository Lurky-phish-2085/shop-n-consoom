public class FoodItem extends Item {

	private int satietyLevel;

	public FoodItem(String name, String description, int price, int satietyLevel) {
		super(name, description, price);
		
		this.satietyLevel = satietyLevel;
	}

	public int getSatietyLevel() {
		return satietyLevel;
	}

	public void setSatietyLevel(int level) {
		this.satietyLevel = level;
	}
}
