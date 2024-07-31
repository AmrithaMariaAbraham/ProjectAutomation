package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class ActionClass extends Base
{
  public void actionClass()
  {
	  driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	 //1st element drag
	  WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	  Actions action1=new Actions(driver);
	  action1.moveToElement(drag1).click();
	  action1.doubleClick(drag1).perform();
	  WebElement drop1=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	  action1.dragAndDrop(drag1,drop1).build().perform();
	 //2nd element drag
	  WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	  action1.moveToElement(drag2).click();
	  action1.doubleClick(drag2).perform();
	  action1.dragAndDrop(drag2,drop1).build().perform();	  
	 //3rd element drag
	  WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	  action1.moveToElement(drag3).click();
	  action1.doubleClick(drag3).perform();
	  action1.dragAndDrop(drag3,drop1).build().perform();
	 //4th element drag
	  WebElement drag4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	  action1.moveToElement(drag4).click();
	  action1.doubleClick(drag4).perform();
	  action1.dragAndDrop(drag4,drop1).build().perform();
  }
	public static void main(String[] args) 
	{
		ActionClass obj=new ActionClass();
		obj.initializeBrowser();
		obj.actionClass();
		obj.driverQuitClose();
	}
}
