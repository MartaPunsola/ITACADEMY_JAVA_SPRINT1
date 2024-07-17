package n1exercici1;

import java.util.ArrayList;

public class Year {
	
	private ArrayList<String> months;
	
	public Year() {
		this.months = new ArrayList<String>();
		this.months.add("January");
		this.months.add("February");
		this.months.add("March");
		this.months.add("April");
		this.months.add("May");
		this.months.add("June");
		this.months.add("July");
		this.months.add("August");
		this.months.add("September");
		this.months.add("October");
		this.months.add("November");
		this.months.add("December");
	}
	
	public ArrayList<String> getMonths() {
		return this.months;
	}
	
	

}
