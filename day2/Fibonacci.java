package week1.day2;

import net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice;

public class Fibonacci {
	
	
	


	public static void main(String[] args) {
		
		int R=8,n1=0, n2=1;
		
		for (int i = 1; i <= R; ++i) {
			
			System.out.println(n1+"+");
			
			int sum= n1+n2;;
			n1=n2;
			n2=sum;
			
			
		}

	
	}

}
