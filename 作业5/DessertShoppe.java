package hw5;

public class DessertShoppe {

	static double rate;
	static String name;
	static int width;
	static int itemsize;
	
	public static double cents2dollarsAndCents(int num) {
		return ((double)num/100);
	}
	
	public DessertShoppe(String name, double rate,int width,int itemsize) {
		DessertShoppe.name=name;
		DessertShoppe.rate=rate;
		DessertShoppe.width=width;
		DessertShoppe.itemsize=itemsize;
	}
	
	public static double getRate() {
		return rate;
	}
	public static String getName() {
		return name;
	}
	
	public static int getWidth() {
		return width;
	}
	
	public static int getsize() {
		return itemsize;
	}
	
}
