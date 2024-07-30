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
		System.out.println(buttn.isSelected());
	}
	public void radioButtonsDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioBtnDemo=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radioBtnDemo.click();
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
		System.out.println(radioBtnDemo.isSelected());
	}
	public static void main(String[] args) 
	{
		CheckBox obj=new CheckBox();
		obj.initializeBrowser();
		obj.checkbox();
		obj.radioButtonsDemo();
		//obj.driverQuitClose();
	}
}
