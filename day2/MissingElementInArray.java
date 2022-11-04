package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Ele= {9,4,7,5,1,3,2,8};
		
	Arrays.sort(Ele);
	
	for (int i = 0; i < Ele.length-1; i++) {
		
		if (Ele[i]!=(i+1)) {
			System.out.println("missing number" +(i+1));
			break;
		}
		
	}
	

	}

}
