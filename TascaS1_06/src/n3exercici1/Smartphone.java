package n3exercici1;

public class Smartphone implements Phone {

	@Override
	public void call() {
		System.out.println("I am making a call.");
		
	}
	
	public void takePhotos() {
		System.out.println("I am taking a photo.");
	}

}
