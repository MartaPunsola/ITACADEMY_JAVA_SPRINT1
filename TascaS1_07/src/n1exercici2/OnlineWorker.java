package n1exercici2;

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
	
	@Deprecated
	public float christmasPlus() {
		final int PLUS = 100;
		return super.getHourlySalary() + (float)PLUS;
	}
	
	@Deprecated
	public float penalty(int delay) {
		return super.getHourlySalary() - (float)delay;
	}

}

