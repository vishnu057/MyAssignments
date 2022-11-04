package week1.day2;

public class SecondSmallestNumber {
	

		public static void main(String[] args) {
			
			int num;
			
			
			int a[]= {12,24,48,62,75,91};
			
			
			for (int i = 0; i < a.length; i++) {
				
				for (int j = i; j < a.length-1; j++) {
					
					if(a[i] > a[j+1]) {
						
						num = a[i];
						
						a[i] = a[j+1];
						
						
						a[j+1] = num;
					}
				}
			}
			
		System.out.println("Second smallest number " + a[1]);
			
		}

	}

