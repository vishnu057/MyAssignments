package week3.day2.Assignment2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {
	
	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		
String text = "We learn java basics as part of java sessions in java week1";
		
		String[] textout = text.split(" ");
		
		Set<String>set=new LinkedHashSet<String>();
		
		for (String s:textout) {
			set.add(s);
		}
		Iterator exedup=set.iterator();
		
		while(exedup.hasNext()) {
			System.out.println(exedup.next()+" ");
		}
		
	}

	
	
	
}