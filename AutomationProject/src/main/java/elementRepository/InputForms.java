package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InputForms 
{
	WebDriver driver;
	public void inputData()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
        message.sendKeys("Hi");
        WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("5");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("7");
	}
	public static void main(String[] args)
	{
		InputForms obj=new InputForms();
		obj.inputData();
	}
}
