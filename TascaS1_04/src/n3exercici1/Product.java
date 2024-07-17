package n3exercici1;

import java.util.Objects;

public class Product {
	
	private String name;
	private float price;
	
	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return Objects.equals(name, other.name) && price == other.price;
    }
	

}
