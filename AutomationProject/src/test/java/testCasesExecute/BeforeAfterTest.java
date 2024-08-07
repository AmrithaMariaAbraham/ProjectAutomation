package testCasesExecute;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class BeforeAfterTest {
  @Test
  public void add() 
  {
	  int sum,a=3,b=5;
	  sum=a+b;
	  System.out.println("Sum:"+sum);
  }
  @Test
  public void add1() 
  {
	  int sum,a=3,b=5;
	  sum=a+b;
	  System.out.println("Sum:"+sum);
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test");
  }

}
