
import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int money;

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

}
