package week1.day2;

import java.util.Iterator;

public class PrimeNumber {
	
public static void main(String[] args) {
	
	int num= 15;
	boolean out= false;
	
	for (int i = 2; i <= num/2; i++) {
		
		int a;
		a=num%i;
		if(a==0) {
			out=true;
		}
	break;
		
	}
	
	if(out==true)
	{ System.out.println("prime");
	}
	
	else {
		System.out.println("NOt a prime");
	}
	
}
}
