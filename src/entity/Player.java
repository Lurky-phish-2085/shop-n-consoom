package entity;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int money;

	private int hungerLevel = 50;
	private int thirstLevel = 50;

	private List<Item> inventory = new ArrayList<>();

	public Player(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public List<Item> getInventory() {
		return inventory;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void buy(Item item, int itemPrice) {
		money -= itemPrice;
		getInventory().add(item);
	}

	public void eat(FoodItem food) {
		int satietyLevel = food.getSatietyLevel();

		if (getInventory().remove(food)) {
			if (hungerLevel > satietyLevel) {
				hungerLevel -= satietyLevel;
			} else {
				satietyLevel = 0;
			}
		}
	}

	public void drink(BeverageItem beverage) {
		int quenchLevel = beverage.getQuenchLevel();

		if (getInventory().remove(beverage)) {
			if (thirstLevel > quenchLevel) {
				thirstLevel -= quenchLevel;
			} else {
				thirstLevel = 0;
			}
		}
	}

}
