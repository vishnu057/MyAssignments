package week1.day2;

public class Palindrome {

	/*
	 * Assignment:2
	 * 
	 * Check the given number is palindrome or not
	 * 
	 * Int num =34343
	 * 
	 * Initialize a temporary variable.
	 * 
	 * Reverse the number (using for loop and add to the temporary variable)
	 * 
	 * Compare the temporary number with reversed number
	 * 
	 * If both numbers are same, print "palindrome number"
	 * 
	 * Else print "not palindrome number"
	 */
	
	public static void main(String[] args)
	{
	int num = 34343, reversedInteger = 0, remainder, originalInteger;

	originalInteger = num;

	
	while( num != 0 )
	{
	remainder = num % 10;
	reversedInteger = reversedInteger * 10 + remainder;
	num  /= 10;
	}

	if (originalInteger == reversedInteger)
	System.out.println(originalInteger + " is a palindrome.");
	else
	System.out.println(originalInteger + " is not a palindrome.");
	}
	}

 