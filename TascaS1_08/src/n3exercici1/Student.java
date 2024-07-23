package n3exercici1;

public class Student {
	
	private String name;
	private int age;
	private String course;
	private float grade;
	
	public Student(String name, int age, String course, float grade) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	public float getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age + ", Course: " + this.course + ", Grade: " + this.grade + ".";
	}

}
