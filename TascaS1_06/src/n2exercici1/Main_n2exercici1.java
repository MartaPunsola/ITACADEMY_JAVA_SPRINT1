package n2exercici1;

public class Main_n2exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "This is a sentence.";
		double pi = 3.14d;
		int num = 85;
		
		System.out.println("The method can receive two parameters in any order and the third needs to be an integer:");
		System.out.println(GenericMethods.genericMethod(sentence, pi, num) + "\n");
		System.out.println(GenericMethods.genericMethod(pi, sentence, num));

	}

}
