package n1exercici2;

public class InPersonWorker extends Worker {

	private static float fuel;
	
	public InPersonWorker(String name, String surname, float hourlySalary) {
		super(name, surname, hourlySalary);
	}
	
	static {
		InPersonWorker.fuel = 70;
	}
	
	@Override
	public float calculateSalary(int hours) {
		return super.calculateSalary(hours) + InPersonWorker.fuel;
	}
	
	@Deprecated
	public void greeting() {
		System.out.println("Hi! My name is " + super.getName() + " " + super.getSurname() + ". Nice to meet you!");
	}
	
	@Deprecated
	public void changeData(String name, String surname) {
		super.setName(name);
		super.setSurname(surname);
		
	}
	
}
