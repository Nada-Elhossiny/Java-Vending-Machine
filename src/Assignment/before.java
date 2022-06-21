package Assignment;

public class before {
	private String name;
	private double price;
	private int maxQuantity;
	private static int currentStock;
	
	public before (String nm, double pr, int qu ) {
		name = nm;
		price = pr;
		currentStock = qu;
		maxQuantity = 50;
	}	
	public before () {
	}
	
	public void customer() {
		chooseProduct();
		getPrice();
		getCurrentStock();
		buy();
	}
	public void owner() {
		setPrice(price);
		getCurrentStock();
		checkTotalSales();
	}
	public void chooseProduct() {
		
	}
	public double getPrice() {
		return price;
	}
	public int getCurrentStock() {
		return currentStock;
	}
	public void buy() {
		currentStock-=1;
	}
	public void setPrice(String product) {
		this.price = price;
	}
	public void checkTotalSales() {
		
	}
	public static void main(String[] args) {
		before chips = new before ("Chips", 2.0, currentStock);
		before chocolate = new before ("Chocolate", 2.5, currentStock);
		before juice = new before ("Juice", 1.5, currentStock);
		before popcorn = new before ("Popcorn", 2.0, currentStock);
		before icecream = new before ("Icecream", 1.0, currentStock);
	}

}

