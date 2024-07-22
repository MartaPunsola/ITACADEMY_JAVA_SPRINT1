package n1exercici1;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker worker1 = new Worker("John", "Smith", 20.5f);
		OnlineWorker worker2 = new OnlineWorker("Sandra", "McLaren", 20.5f);
		InPersonWorker worker3 = new InPersonWorker("Kelly", "Street", 20.5f);
		
		System.out.println("Comparing the salaries:");
		System.out.println("Regular worker: " + worker1.calculateSalary(37) + " euros.");
		System.out.println("Online worker: " + worker2.calculateSalary(37) + " euros.");
		System.out.println("In-person worker: " + worker3.calculateSalary(37) + " euros.");

	}

}
