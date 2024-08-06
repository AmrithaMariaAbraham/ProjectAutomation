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
	driver.manage().window().maximize();
	WebElement contactUs=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contactUs.click();
	WebElement Login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	Login.click();
	String parentWindow=driver.getWindowHandle();
	System.out.println("Parent Window:"+parentWindow);
	Set<String> allWindow=driver.getWindowHandles();
	String title="";
	//System.out.println("All window handle:"+allWindow);
	for(String temp:allWindow)
	{
		if(!temp.equals(parentWindow))
		{
		System.out.println("All Windows"+temp);
		driver.switchTo().window(temp);
		//System.out.println(driver.getTitle());
		title=driver.getTitle();
		}
		if(title.equals("WebDriver | Login Portal"))
		{
			WebElement userName=driver.findElement(By.xpath("//input[@id='text']"));
			userName.sendKeys("Obsqura");
		}
		if(title.equals("WebDriver | Contact Us"))
		{
			WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
			firstName.sendKeys("Techno");
		}		
	}	
}
	public static void main(String[] args) 
	{
		MultipleWindowHandling obj=new MultipleWindowHandling();
		obj.multipleWindowHandling();
	}
}
