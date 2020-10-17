package hw5;

public class Candy extends DessertItem {

	private int price;
	private double weight;
	public Candy(String name, double weight, int price) {
		super(name);
		
		this.weight=weight;
		this.price=price;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}

	@Override
	public int getCost() {
		return ( (int) Math.round(price*weight));
	}
	
	
	
}
