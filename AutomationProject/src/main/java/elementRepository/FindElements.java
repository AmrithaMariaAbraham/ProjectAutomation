package elementRepository;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElements 
{
	WebDriver driver;
	public void elements()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");	
		List<WebElement> checkBoxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement value:checkBoxs)
		{
			value.click();
		}		
	}
	public static void main(String[] args) 
	{
		FindElements obj=new FindElements();
		obj.elements();
	}
}
