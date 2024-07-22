package n3exercici1;

@JsonSerializer
public class Worker {
	
	private String name;
	private String surname;
	private float hourlySalary;
	
	public Worker(String name, String surname, float hourlySalary) {
		this.name = name;
		this.surname = surname;
		this.hourlySalary = hourlySalary;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public float getHourlySalary() {
		return hourlySalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setHourlySalary(float hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	public float calculateSalary(int hours) {
		return this.hourlySalary * (float)hours;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Surname: " + this.surname + ", Hourly salary: " + this.hourlySalary;
	}
	

}
