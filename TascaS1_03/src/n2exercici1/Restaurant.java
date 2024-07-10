package n2exercici1;

import java.util.Objects;

public class Restaurant {
	
	private String name;
	private int points;
	
	public Restaurant(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, points);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name) && points == other.points;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nRating: " + this.points + "\n";
	}
	
	
	
	
	
	

}
