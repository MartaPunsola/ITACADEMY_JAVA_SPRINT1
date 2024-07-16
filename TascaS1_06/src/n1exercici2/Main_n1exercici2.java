package n1exercici2;

public class Main_n1exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("John", "Maloney", 52);
		String sentence = "This is a sentence.";
		int num = 47;
		
		System.out.println("The method can receive the parameters in any order:");
		System.out.println(GenericMethods.genericMethod(person1, sentence, num) + "\n");
		System.out.println(GenericMethods.genericMethod(num, sentence, person1) + "\n");
		System.out.println(GenericMethods.genericMethod(sentence, num, person1) + "\n");


	}

}
