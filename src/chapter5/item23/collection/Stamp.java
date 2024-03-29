package chapter5.item23.collection;

public class Stamp implements MyFavorites {

	private String name;
	private int price;

	public Stamp(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
