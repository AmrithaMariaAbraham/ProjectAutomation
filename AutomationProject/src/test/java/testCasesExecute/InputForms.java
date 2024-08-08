package testCasesExecute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class InputForms extends ObsquraBaseClass
{
  @Test
  public void inputForm() 
  {
	  WebElement enterMesg=driver.findElement(By.id("single-input-field"));
	  enterMesg.sendKeys("Welcome to testNG");
	  WebElement showMesg=driver.findElement(By.id("button-one"));
	  showMesg.click();
	  WebElement valueA=driver.findElement(By.id("value-a"));
	  valueA.sendKeys("10");
	  WebElement valueB=driver.findElement(By.id("value-b"));
	  valueB.sendKeys("15");
	  WebElement getTotal=driver.findElement(By.id("button-two"));
	  getTotal.click();
  }
}
