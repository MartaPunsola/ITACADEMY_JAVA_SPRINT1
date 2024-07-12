package n1exercici1;

import java.util.*;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Month> year = new ArrayList<Month>();
		
		year.add(new Month("January"));
		year.add(new Month("February"));
		year.add(new Month("March"));
		year.add(new Month("April"));
		year.add(new Month("May"));
		year.add(new Month("June"));
		year.add(new Month("July"));
		year.add(new Month("September"));
		year.add(new Month("October"));
		year.add(new Month("November"));
		year.add(new Month("December"));
		year.add(7, new Month("August"));
		
		System.out.println("The 12 months appear in the correct order, including August:");
		int order = 1;
		for (Month month : year) {
			System.out.println(order + ". " + month.getName());
			order++;
		}
		System.out.println();
		
		HashSet<Month> year2 = new HashSet<Month>(year);
		
		System.out.println("The size of the HashSet stays the same before and after trying to duplicate a month:");
		System.out.println(year2.size());
		year2.add(new Month("August"));
		System.out.println(year2.size());
		System.out.println();
		
		System.out.println("The months in the HashSet don't follow any specific order:");
		order = 1;
		for (Month month : year2) {
			System.out.println(order + ". " + month.getName());
			order++;
		}
		System.out.println();
		
		Iterator<Month> it = year2.iterator();
		
		System.out.println("Going through the HashSet with an iterator:");
		order = 1;
		while(it.hasNext()) {
			System.out.println(order + ". " + it.next().getName());
			order++;
		}
		
		
	}

}
