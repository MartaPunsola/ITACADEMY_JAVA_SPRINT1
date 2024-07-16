package n2exercici2;

import n1exercici2.Person;

public class Main_n2exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities = {"Berlin", "London", "Geneva", "Cannes"};
		Person[] people = {new Person("John", "Maloney", 52),
				new Person("Mary", "Smith", 25),
				new Person("Felicity", "Harper", 68)};
		
		System.out.println("The method receives a list of Strings:");
		GenericMethods.genericMethod(cities);
		System.out.println();
		System.out.println("The method receives a list of objects:");
		GenericMethods.genericMethod(people);
		
	}

}
