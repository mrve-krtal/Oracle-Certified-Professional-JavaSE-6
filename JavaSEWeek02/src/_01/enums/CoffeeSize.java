package _01.enums;

public enum CoffeeSize {
	
	SHORT(3), TALL(5), GRANDE(7), VENTI(10);

	private int price;

	CoffeeSize(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}



