package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnabledIgnore {
	
	@Test(enabled = true)
	public void leadCreate() {
		System.out.println("CreateLead");
		
	}
	@Test(enabled = false)
	public void leadEdit() {
		System.out.println("EditLead");
	}
	@Ignore
	@Test
	public void leadDelete() {
		System.out.println("DeleteLead");
	}

}
