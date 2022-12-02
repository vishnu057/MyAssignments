package week5.day2;

import org.testng.annotations.Test;

import week5.day1.CreateLead;

public class LearnPriority {
	@Test(priority = 3)
	public void leadCreate() {
		System.out.println("CreateLead:3rd priority");
		
	}
	@Test(priority = 2)
	public void leadEdit() {
		System.out.println("EditLead:2nd priority");
	}
	@Test(priority = 1)
	public void leadDelete() {
		System.out.println("DeleteLead:1st priority");
	}

}
