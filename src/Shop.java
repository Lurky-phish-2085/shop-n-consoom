
import java.util.ArrayList;
import java.util.List;

public abstract class Shop {

	private String name;
	private String description;

	private List<Item> inventory = new ArrayList<>();

	public Shop(String name, String description) {
		setName(name);
		setDescription(description);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<Item> getInventory() {
		return inventory;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
