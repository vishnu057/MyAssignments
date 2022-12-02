package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnInvocationCountTimeOutThreadSize {
	
	@Test(invocationCount = 4, invocationTimeOut = 1000, threadPoolSize = 3)
	public void leadCreate() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("CreateLead");
		
	}
	@Test
	public void leadEdit() {
		System.out.println("EditLead");
	}
	
	@Test
	public void leadDelete() {
		System.out.println("DeleteLead");
	}

}
