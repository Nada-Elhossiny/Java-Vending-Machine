package Assignment;

//class declaration
public class VendingMachine { 
	// 4 instance variables
	private String productName; 
	private double price;
	private int maxQuantity = 50;
	private int currentStock;
	
	// constructor with 3 parameters
	public VendingMachine (String nm, double pr, int st) {
		productName = nm;
		price = pr;
		currentStock = st;
	}	
	
	// no argument constructor
	public VendingMachine () { 
	}
	
	public void buyProduct(int q) { 
		// displays all the methods needed
		System.out.println("Item chosen: " + productName); 
		System.out.println("Original price of item: $" + getPrice());
		System.out.println("New price of item: $" + setPrice());
		System.out.println("Ordered quantity: " + q);
		// decrements each time a product is purchased if it is in stock
		if (stockAvailable(q)) {
			currentStock-=q;
			System.out.println("Remaining stock after purchase: " + getCurrentStock());
			System.out.println("Total sales: $" + totalSales());
		}
		// skips a line so that the orders don't directly follow each other in console
		System.out.println(" "); 
	}

	public void randomSelection() {
		// displays name and price of the product that was randomly selected
		System.out.println("Random item selected: " + getName());
		System.out.println("Price of item: $" + setPrice());
		// skips a line so that the orders don't directly follow each other in console
		System.out.println(" "); 
	}
	
	// sets the name of the product
	public void setName(String name) {
		this.productName = name;
	}

	// retrieves the name of the product
	public String getName() {
		return productName;
	}

	// retrieves the current price of the product
	public double getPrice() {
		return price;
	}

	// sets the new price of the product at $0.5 more than the original price.
	public double setPrice () {
		price+=0.5;
		return price;
	}
	
	// retrieves the amount of stock left
	public int getCurrentStock() { 
		return currentStock;
	}
	
	// Stock checker that checks if product is in stock before purchase 
	public boolean stockAvailable(int q) {
		boolean stockAvailable = true;
		if (currentStock < q ) {
			stockAvailable = false;
		} 
		System.out.println("Stock available: " + stockAvailable);
		return stockAvailable;
	}
	
	// calculates revenue made by the total sales of a product
	public double totalSales () { 
		double sales = price*(maxQuantity-currentStock); 
		return sales;
	}
}