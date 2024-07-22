package n1exercici2;

public class InPersonWorker extends Worker {

	private static float fuel = 0;
	
	public InPersonWorker(String name, String surname, float hourlySalary) {
		super(name, surname, hourlySalary);
	}
	
	static {
		InPersonWorker.fuel = 70;
	}
	
	@Override
	public float calculateSalary(int hours) {
		return (super.getHourlySalary() * (float)hours) + InPersonWorker.fuel;
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
