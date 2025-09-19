package Practice;
import org.testng.annotations.Test;

public class TestNGPractise {
	
@Test(priority = 1, invocationCount = 3, dependsOnMethods = {"DeleteUser", "ModifyUser"})

public void CreateUser()
{
System.out.println("Creating User");	
}
@Test(priority = 3)

public void DeleteUser()
{
System.out.println("Deleting User");	
}
@Test(priority = 2)

public void ModifyUser()
{
System.out.println("Modify User");	
}

}
