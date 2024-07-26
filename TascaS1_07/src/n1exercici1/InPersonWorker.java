package n1exercici1;

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
	
}
