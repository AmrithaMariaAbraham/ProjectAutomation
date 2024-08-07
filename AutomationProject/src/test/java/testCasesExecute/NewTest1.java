package testCasesExecute;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class NewTest1 
{
  @Test
  public void mul() 
  {
	  int a=3,b=4,prod;
	  prod=(a*b);
	  System.out.println("Product:"+prod);
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
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before Class");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("After Class");
  }

}
