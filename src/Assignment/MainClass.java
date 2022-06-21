package Assignment;

public class MainClass { 

	public static void main(String[] args) {
		// creating the 5 objects in the machine 
		VendingMachine chips = new VendingMachine ("Chips", 2.0, 50);
		VendingMachine chocolate = new VendingMachine ("Chocolate", 2.5, 50);
		VendingMachine juice = new VendingMachine ("Juice", 1.5, 50);
		VendingMachine popcorn = new VendingMachine ("Popcorn", 2.0, 50);
		VendingMachine icecream = new VendingMachine ("Icecream", 1.0, 50);
		
		// testing the no argument constructor to create an object with default values
		VendingMachine empty = new VendingMachine (); 

	// Randomizer that makes 5 selections
		for (int i = 0; i < 5; i++) { 
			if ((int) (Math.random()*5+1) == 1) {
				chips.randomSelection();
			}
			else if ((int) (Math.random()*5+1) == 2) {
				chocolate.randomSelection();
			}
			else if ((int) (Math.random()*5+1) == 3) {
				juice.randomSelection();
			}
			else if ((int) (Math.random()*5+1) == 4) {
				popcorn.randomSelection();
			}
			else {
				icecream.randomSelection();
			}
		}
		//Purchase items to test price hike
		chips.buyProduct(200);
		chocolate.buyProduct(5);
		icecream.buyProduct(6);
		juice.buyProduct(17);
		popcorn.buyProduct(3);
	}

}
