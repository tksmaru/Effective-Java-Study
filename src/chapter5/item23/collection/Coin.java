package chapter5.item23.collection;

public class Coin implements MyFavorites {

	private String name;
	private int price;

	public Coin(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
