package testScript;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.InputFormPageMessage;
import pages.InputFormPageSum;

public class InputFormPageTest extends Base 
{
@Test(priority=1)
  public void showMessageDisplay()
  {
	  String message1="Obsqura Welcomes you";
	  InputFormPageMessage inputFormPageMesg=new InputFormPageMessage(driver);
	  inputFormPageMesg.enterMessage(message1);
	  inputFormPageMesg.showMessageClick();
  }
  @Test(priority=2)
  public void sumViewtwoValues()
  {
	String valuea1="10";
	String valueb1="15";
	InputFormPageSum inputformpage=new InputFormPageSum(driver);
	inputformpage.enterValueforA(valuea1);
	inputformpage.enterValueforB(valueb1);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(250,250)");
	inputformpage.gettotalClick();
  }
}
