package hw5;

public class IceCream extends DessertItem {

	protected int cost;
	
	public IceCream (String name, int cost) {
		super(name);
		this.cost=cost;
	}
	
	
	@Override
	public int getCost() {
		
		return cost;
	}
	

	
}
