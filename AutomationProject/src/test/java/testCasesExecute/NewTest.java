package testCasesExecute;
import org.testng.annotations.Test;
public class NewTest
{
  @Test(priority = 3)
  public void display() 
  {
	 System.out.println("TestNG scripting"); 
  }
  @Test(priority = 1)
  public void show()
  {
	  System.out.println("Obsqura");
  }
  @Test(priority = 2)
  public void add()
  {
	  System.out.println("Hi Welcome");
  }
}
