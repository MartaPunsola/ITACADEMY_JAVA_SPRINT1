package n1exercici1;

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
	
}
