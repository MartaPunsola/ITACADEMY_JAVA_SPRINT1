package n1exercici2;

public class DniCalculation {
	
	public static char dniLetter(int numDni) {
		int remainder = 0; 
		char letterDni = ' ';	
		char[] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int[] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
		
		for (int i = 0; i < 23; i++) {
			remainder = numDni % 23;
			if (remainder == numbers[i]) {
				letterDni = letters[i];
			}
		}
		return letterDni;
	}

}
