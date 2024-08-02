package elementRepository;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class DropDown extends Base
{
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		/*WebElement drop=driver.findElement(By.xpath("//*[@id='single-input-field']"));
		drop.click();
		Select select=new Select(drop);
		select.selectByIndex(1);*/
		WebElement selectColor=driver.findElement(By.id("multi-select-field"));
		Select select1=new Select(selectColor);
		/*WebElement element=select.getFirstSelectedOption();
		List<WebElement> element1=select.getAllSelectedOptions();*/
		List<WebElement> selectColor1=select1.getAllSelectedOptions();
		for(WebElement element:selectColor1)
		{
			System.out.println(element);
		}
		WebElement getFirstSelected=driver.findElement(By.id("button-first"));
		getFirstSelected.click();
		
	}
	public static void main(String[] args)
	{
		DropDown obj=new DropDown();
		obj.initializeBrowser();
		obj.dropDown();
		//obj.driverQuitClose();
	}
}
