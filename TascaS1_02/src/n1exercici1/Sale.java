package n1exercici1;

import java.util.ArrayList;

public class Sale {
	
	private ArrayList<Product> products;
	private float totalPrice;
	
	public String calculateTotal() throws EmptySaleException {
		if(this.products == null) {
			throw new EmptySaleException("To sell a product you need to add it first.");
		} else {
			for(int i = 0; i < this.products.size(); i++) {
				this.totalPrice += products.get(i).getPrice();
			}
		}
		
		return "The total price of the sale is: " + this.totalPrice + " euros.";
	}


}
