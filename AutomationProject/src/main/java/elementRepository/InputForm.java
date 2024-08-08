package elementRepository;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class InputForm extends Base 
{
	public void input()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
        message.sendKeys("Hello");
        //Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement clickShowbtn=driver.findElement(By.id("button-one"));
        wait.until(ExpectedConditions.elementToBeClickable(clickShowbtn));
        clickShowbtn.click();        
	}
	public void add()
	{
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("10");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("15");
		WebElement getTotalClick=driver.findElement(By.id("button-two"));
		getTotalClick.click();
		System.out.println(getTotalClick.getText());
	}
	public static void main(String[] args) 
	{
		InputForm obj=new InputForm();
		obj.initializeBrowser();
		obj.input();
		obj.add();
		obj.driverQuitClose();
	}
}
