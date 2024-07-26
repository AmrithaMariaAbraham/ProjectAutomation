package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class InputForm extends Base 
{
	public void input()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
        message.sendKeys("Hello");
        WebElement clickShowbtn=driver.findElement(By.id("button-one"));
        clickShowbtn.click();        
	}
	public void add()
	{
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("10");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("15");
		//Scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(350,350)");
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
