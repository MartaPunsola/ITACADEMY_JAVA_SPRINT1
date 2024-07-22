package n1exercici1;

public class OnlineWorker extends Worker {

	private final float INTERNET;
	
	public OnlineWorker(String name, String surname, float hourlySalary) {
		super(name, surname, hourlySalary);
		this.INTERNET = 50f;
	}
	
	@Override
	public float calculateSalary(int hours) {
		return (super.getHourlySalary() * (float)hours) + this.INTERNET;
	}

}

