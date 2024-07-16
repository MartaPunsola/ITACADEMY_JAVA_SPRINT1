package n1exercici1;

public class NoGenericMethods {
	
	private String word1;
	private String word2;
	private String word3;
	
	public NoGenericMethods(String word1, String word2, String word3) {
		this.word1 = word1;
		this.word2 = word2;
		this.word3 = word3;
	}

	public String getWord1() {
		return word1;
	}

	public String getWord2() {
		return word2;
	}

	public String getWord3() {
		return word3;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

	public void setWord3(String word3) {
		this.word3 = word3;
	}
	
	@Override
	public String toString() {
		return "Word 1: " + this.word1 + "\nWord 2: " + this.word2 + "\nWord 3: " + this.word3;
	}
	
	

}
