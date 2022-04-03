package entity;

public class BeverageItem extends Item {

	private int quenchLevel;

	public BeverageItem(String name, String description, int price, int quenchLevel) {
		super(name, description, price);
		
		this.quenchLevel = quenchLevel;
	}

	public int getQuenchLevel() {
		return quenchLevel;
	}

	public void setQuenchLevel(int level) {
		this.quenchLevel = level;
	}

}
