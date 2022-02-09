public abstract class Item {

	private String name;
	private String description;
	private int price;

	public Item(String name, String description, int price) {
		setName(name);
		setDescription(description);
		setPrice(price);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getName() + ":" +  getPrice();
	}
}
