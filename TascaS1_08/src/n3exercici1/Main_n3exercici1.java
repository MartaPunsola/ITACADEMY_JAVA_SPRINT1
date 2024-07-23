package n3exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class Main_n3exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<Student>();
		List<Student> studentsLetterA = new ArrayList<Student>();
		
		students.add(new Student("John", 35, "PHP", 8.25f));
		students.add(new Student("Rory", 14, "Java", 5.5f));
		students.add(new Student("Sally", 50, "Java", 6.25f));
		students.add(new Student("Andy", 17, "PHP", 4.25f));
		students.add(new Student("Amy", 40, "PHP", 7.75f));
		students.add(new Student("Michael", 28, "Java", 3.6f));
		students.add(new Student("Ander", 22, "Java", 9.25f));
		students.add(new Student("Tom", 16, "PHP", 6.75f));
		students.add(new Student("Arnold", 15, "PHP", 5.25f));
		students.add(new Student("Chris", 37, "Java", 4.5f));
		
		System.out.println("Showing the student's name and age:");
		students.stream().map(s -> "Name: " + s.getName() + ", Age: " + s.getAge()).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Students with a name starting with the letter \"a\":");
		studentsLetterA = students.stream().filter(s -> s.getName().startsWith("A")).collect(Collectors.toList());
		studentsLetterA.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Students with a grade of 5 or more points:");
		students.stream().filter(s -> s.getGrade() >= 5).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Not PHP students with a grade of 5 or more points:");
		students.stream().filter(s -> s.getGrade() >= 5 && !s.getCourse().equalsIgnoreCase("PHP")).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Java students that are older than 18:");
		students.stream().filter(s -> s.getCourse().equalsIgnoreCase("Java") && s.getAge() >= 18).forEach(System.out::println);

	}

}
