package week5.day2;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void leadCreate(){
    
		System.out.println("CreateLead");
		 throw new RuntimeException();
		
	}
	@Test
	public void leadEdit() {
		System.out.println("EditLead");
	}
	
	@Test(dependsOnMethods = {"leadCreate"}, alwaysRun = true)
	public void leadDelete() {
		System.out.println("DeleteLead");
	}
	
}
