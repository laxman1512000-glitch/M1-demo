package Practice;

import org.testng.annotations.Test;

public class drivingCar {

	@Test(priority = 0)
	public void startTheEngine() {
		System.out.println("Start the car");
			}
	@Test (priority = 1)

	public void firstGear ()
	{
		System.out.println("this is first gear");
	}
	@Test  (priority = 2)

	
	public void secondGear ()
	{
		System.out.println("this is second gear");
	}
	@Test  (priority = 3)

	
	public void thirdGear ()
	{
		System.out.println("this is third gear");
	}
	@Test  (priority = 4)

	
	public void fourGear ()
	{
		System.out.println("this is four gear");
	}
}
