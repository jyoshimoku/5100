package hw5;

import java.text.Format;
import java.util.Iterator;
import java.util.Vector;

public class Checkout {

	Vector<DessertItem> v=new Vector<DessertItem>();
	
	public Checkout() {
		
	}
	
	public int numberOfItems() {
		return v.size();
		
	}
	
	public void enterItem(DessertItem item) {
		v.addElement(item);
		
		
	}
	
	public void clear() {
		v.removeAllElements();
	}
	
	public int totalCost() {
		int totalCost = 0;
		for (int i = 0; i < v.size(); i++) {
			 totalCost+=v.get(i).getCost();
		}
		return totalCost;
	}
	
	public int totalTax() {
		int totaltax=(int) Math.round(totalCost()*DessertShoppe.getRate());
		return totaltax;
		
	}
	
	public String toString() {
		String list = DessertShoppe.getName()+"\r";
		list+= "----------------------------------\n";
		
		
		Iterator it = v.iterator();
		
		while (it.hasNext()) {
			
			DessertItem item =(DessertItem) it.next();
			if (item instanceof Candy) {
				
				Candy candy = (Candy)item;
			
				list+= candy.getWeight() + " lbs. @ "+DessertShoppe.cents2dollarsAndCents(candy.getPrice())+"/lb.\r";
				
				list+= String.format("%-30s%s\r",candy.getName(),DessertShoppe.cents2dollarsAndCents(candy.getCost()));
		}
			else if (item instanceof Cookie) {
				
				Cookie cookie= (Cookie)item;
				list+= cookie.getNumber()+" @ "+DessertShoppe.cents2dollarsAndCents(cookie.getPrice())+" /dz.\r";
				
				list+= String.format("%-30s%s\r",cookie.getName(),DessertShoppe.cents2dollarsAndCents(cookie.getCost()));
				
			}
			else if (item instanceof Sundae) {
				Sundae sundae=(Sundae)item;
				list+= sundae.getToppingName()+" with\r";
				
				list+= String.format("%-30s%s\r",sundae.getName(),DessertShoppe.cents2dollarsAndCents(sundae.getCost()));
				
			}
			else if (item instanceof IceCream) {
				IceCream iceCream= (IceCream)item;
				
				list+= String.format("%-30s%s\r",iceCream.getName(),DessertShoppe.cents2dollarsAndCents(iceCream.getCost()));
			}
			
			
		
		}
		list+= "----------------------------------\n";
		list+="Tax"+ " "+ DessertShoppe.getRate()+"\r";
		list+="Total Cost "+DessertShoppe.cents2dollarsAndCents(this.totalCost())+"\n";
		
		
		return list;
	}
	
}
