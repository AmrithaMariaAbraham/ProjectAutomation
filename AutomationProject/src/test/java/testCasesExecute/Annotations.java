package testCasesExecute;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class Annotations {
  @Test
  public void show() 
  {
	  System.out.println("Hi");
  }
  @Test
   public void display()
  {
	  System.out.println("Display");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method");
  }
}
