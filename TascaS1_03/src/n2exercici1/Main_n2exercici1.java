package n2exercici1;

import java.util.HashSet;

public class Main_n2exercici1 {
	
	public static void main(String[] args) {
		
		HashSet<Restaurant> catering = new HashSet<Restaurant>();
		
		catering.add(new Restaurant("Étoile", 4));
		catering.add(new Restaurant("The meat", 3));
		catering.add(new Restaurant("Rincón", 4));
		catering.add(new Restaurant("Veggie Free", 3));
		catering.add(new Restaurant("American Dinner", 2));
		catering.add(new Restaurant("Étoile", 4));
		catering.add(new Restaurant("The meat", 5));
		
		int order = 1;
		for (Restaurant restaurant : catering) {
			System.out.println("Restaurant number " + order + ":\n" + restaurant.toString());
			order++;
		}
		
	}

}
