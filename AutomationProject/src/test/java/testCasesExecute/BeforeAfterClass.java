package testCasesExecute;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class BeforeAfterClass {
  @Test
  public void Welcome() 
  {
	  System.out.println("Welcome");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("BeforeClass");
  }
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After Class");
  }
}
