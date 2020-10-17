package hw5;

public class TestCheckOut {

	public static void main(String[] args) {
		 Checkout checkout = new Checkout();
		 DessertShoppe shope = new DessertShoppe("Dairy Queen", 0.06,30,20);
		 checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
	     checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
	     checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
	     checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
	     System.out.printf("%-30s%s\n","Number of items: " , checkout.numberOfItems());
	     System.out.printf("%-30s%s\n","Total cost: " , checkout.totalCost());
	     System.out.printf("%-30s%s\n","Total tax: " , checkout.totalTax());
	     System.out.printf("%-30s%s\n","Cost + Tax: ", (checkout.totalCost() + checkout.totalTax()));
	     System.out.println(checkout);
	     checkout.clear();
	     checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
	     checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
	     checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
	     checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
	     checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
	     checkout.enterItem(new Candy("Candy Corn", 3.0, 109));
	     System.out.printf("%-30s%s\n","Number of items: " , checkout.numberOfItems());
	     System.out.printf("%-30s%s\n","Total cost: " , checkout.totalCost());
	     System.out.printf("%-30s%s\n","Total tax: " , checkout.totalTax());
	     System.out.printf("%-30s%s\n","Cost + Tax: ", (checkout.totalCost() + checkout.totalTax()));
	     System.out.println(checkout);

	}

}
