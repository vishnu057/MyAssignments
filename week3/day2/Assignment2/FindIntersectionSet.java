package week3.day2.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionSet {

	public static void main(String[] args) {
		/*
		 * /*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
		 
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		
		Collections.sort(list);
		
		List<Integer>list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		Collections.sort(list2);
		 
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = 0; j < list2.size(); j++) {
				if(list.get(i)==list2.get(j)) {
			
					System.out.println(list.get(i));

}
			}
}
	}

}
