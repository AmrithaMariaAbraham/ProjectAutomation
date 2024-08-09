package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class ScrollDown 
{
	WebDriver driver;
	public void scrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,250)");
	}
}
