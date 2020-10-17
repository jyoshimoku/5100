package hw5;

public class Sundae extends IceCream {

	private String toppingName;
	private int toppingCost;
	
	public Sundae(String name, int cost, String toppingName, int toppingCost) {
		super(name, cost);
		this.toppingCost=toppingCost;
		this.toppingName=toppingName;
	}
	
	
	public String getToppingName() {
		return toppingName;
	}
	@Override
	public int getCost() {
		return (cost+toppingCost);
	}
	
}
