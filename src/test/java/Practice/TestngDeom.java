package Practice;

import org.testng.annotations.Test;

public class TestngDeom {
	
	@Test(priority = 2, invocationCount = 3)
	public void creatUser() {
		System.out.println("user created");
	}
	
	@Test(priority = 1, dependsOnMethods = {"creatUser","deleteUser"})

	public void modifyUser() {
		System.out.println("user modified");
	}
	@Test(priority = 3)
	public void deleteUser() {
		System.out.println("user deleated");
	}



}
