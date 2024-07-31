package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Alert extends Base
{
	public void alert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement oK=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		oK.click();
		driver.switchTo().alert().accept();
	}
	public void confirm()
	{
		WebElement confirm=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		confirm.click();
		driver.switchTo().alert().dismiss();
	}
	public void promptBox()
	{
		WebElement promptBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("Obsqura");
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) 
	{
		Alert obj=new Alert();
		obj.initializeBrowser();
		obj.alert();
		obj.confirm();
		obj.promptBox();
		obj.driverQuitClose();
	}
}
