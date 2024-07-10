package n2exercici2;

import java.util.*;


public class Main_n2exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Restaurant2> restaurants = new TreeSet<Restaurant2>();
		
		restaurants.add(new Restaurant2("restA", 4));
		restaurants.add(new Restaurant2("restB", 3));
		restaurants.add(new Restaurant2("restC", 1));
		restaurants.add(new Restaurant2("restD", 3));
		restaurants.add(new Restaurant2("restE", 4));
		restaurants.add(new Restaurant2("restA", 5));
		restaurants.add(new Restaurant2("restB", 5));
		restaurants.add(new Restaurant2("restE", 2));
		
		int order = 1;
		for (Restaurant2 restaurant : restaurants) {
			System.out.println("Restaurant number " + order + ". " + restaurant.toString());
			order++;
		}
		
		

		
		
		
	}

}
