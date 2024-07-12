package n1exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main_n1exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println("Content of the first list in ascending order:");
		for (Integer integer : list1) {
			System.out.println(integer);
		}
		System.out.println();
		
		List<Integer> list2 = new ArrayList<Integer>(list1);
		Collections.sort(list2, Collections.reverseOrder());
		
		System.out.println("Content of the second list in descending order:");
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		System.out.println();
		
		ListIterator<Integer> it = list1.listIterator();
		
		while(it.hasPrevious()) {
			int number = it.previous();
			list2.add(number);
		}
		
		System.out.println("Content of the second list in descending order thanks to ListIterator:");
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		
	}

}
