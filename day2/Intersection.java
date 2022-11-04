package week1.day2;

public class Intersection {
	
	public static void main(String[] args) {
		
		int[] set1= {1,2,3,4,5,6};
		int[] set2= {2,4,6,8,9,11};
		
		for (int i = 0; i < set1.length; i++) {
			for (int j = 0; j < set2.length; j++) {
				
				if (set1[i]==set2[j]) {
					
					System.out.println("intersection"+ set1[i]);
					
				}
				
			}
		}
	}

}
