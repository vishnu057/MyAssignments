package week3.day2.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=new ArrayList<Integer>();
		
list.add(3);
list.add(6);
list.add(4);
list.add(1);
list.add(9);
list.add(5);
		
		Collections.sort(list);
	
		for (int i = 0; i < list.size(); i++) {
			int data = list.get(i);
					
				}
	System.out.println(list);
	Collections.sort(list);
				
	System.out.println("second large num: " + list.get(4));
		

	}

}
