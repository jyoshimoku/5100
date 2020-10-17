package hw5;

public class Cookie extends DessertItem {
	private int price;
	private int number;
	public Cookie(String name, int number, int price) {
		super(name);
		this.number=number;
		this.price=price;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getNumber() {
		return number;
	}

	@Override
	public int getCost() {
		double x=(double)number/12;
		double num =price*(x);
		return ( (int) Math.round(num));
	}
}
