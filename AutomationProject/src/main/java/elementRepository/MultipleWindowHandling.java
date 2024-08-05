package elementRepository;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindowHandling 
{
	WebDriver driver;
public void multipleWindowHandling()
{
	driver=new ChromeDriver();
	driver.navigate().to("https://webdriveruniversity.com/");
	WebElement contactUs=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contactUs.click();
	WebElement Login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	Login.click();
	String parentWindow=driver.getWindowHandle();
	System.out.println("Parent Window:"+parentWindow);
	Set<String> allWindow=driver.getWindowHandles();
	//System.out.println("All window handle:"+allWindow);
	for(String temp:allWindow)
	{
		if(!temp.equals(parentWindow))
			System.out.println("All Windows"+temp);
	}
}
	public static void main(String[] args) 
	{
		MultipleWindowHandling obj=new MultipleWindowHandling();
		obj.multipleWindowHandling();
	}
}
