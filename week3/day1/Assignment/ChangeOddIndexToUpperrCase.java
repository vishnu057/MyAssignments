package week3.day1.Assignment;

public class ChangeOddIndexToUpperrCase {
	public static void main(String[] args) {
		
          String word="changeme";
          char[] charArray = word.toCharArray();
          
          for (int i = 0; i < charArray.length; i++) {
        	  
        	  if(i%2!=0) {
        		  
        		  System.out.print(Character.toUpperCase(charArray[i]));
        	  }
        	  else {
        		  
         		 System.out.print(charArray[i]);
         	  }
         	  
			
		}
		
	}		
}

