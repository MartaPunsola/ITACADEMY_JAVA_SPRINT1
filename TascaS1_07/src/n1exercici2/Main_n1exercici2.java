package n1exercici2;


public class Main_n1exercici2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlineWorker worker1 = new OnlineWorker("Sandra", "McLaren", 20.5f);
		InPersonWorker worker2 = new InPersonWorker("Kelly", "Street", 20.5f);
				
		System.out.println("Using the deprecated methods of the subclasses without warnings:");
		System.out.println("Hourly salary + Christmas bonus = " + worker1.christmasPlus() + " euros.");
		worker2.greeting();
		System.out.println("Hourly salary - delay = " + worker1.penalty(3)  + " euros.");
		worker2.changeData("Mary", "Porter");
		System.out.println(worker2.toString());
		
	}

}
