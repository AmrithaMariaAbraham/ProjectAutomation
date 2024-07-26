package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class CheckBox extends Base
{
	public void checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");		
		WebElement buttn=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		buttn.click();
	}
	public static void main(String[] args) 
	{
		CheckBox obj=new CheckBox();
		obj.initializeBrowser();
		obj.checkbox();
		obj.driverQuitClose();
	}
}
