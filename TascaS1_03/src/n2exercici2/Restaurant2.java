package n2exercici2;

import java.util.Objects;

public class Restaurant2 implements Comparable<Restaurant2> {
	
	private String name;
	private int points;
	
	public Restaurant2(String name, int points) {
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
		Restaurant2 other = (Restaurant2) obj;
		return Objects.equals(name, other.name) && points == other.points;
	}
	
	@Override
	 public int compareTo(Restaurant2 other) {
       int cmp = this.getName().compareTo(other.getName());
       if (cmp != 0) {
           return cmp;
       }
       return Integer.compare(other.getPoints(), this.points);
   }
	
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Rating: " + this.points;
	}

}
