package elementRepository;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectClass 
{
	public WebDriver driver;
	public void select()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		WebElement drop1=driver.findElement(By.id("dropdowm-menu-1"));
		drop1.click();
		Select select= new Select(drop1);
		//select.selectByVisibleText("JAVA");
		//select.selectByIndex(1);
		select.selectByValue("python");
		
	}
	public void quit()
	{
		driver.quit();
	}
	public static void main(String[] args) 
	{
		SelectClass obj=new SelectClass();
		obj.select();
		//obj.quit();
	}

}
