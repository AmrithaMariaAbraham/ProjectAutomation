package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Locators extends Base
{
	public void id()
	{
		//Input Form		
		WebElement enterMessage=driver.findElement(By.id("single-input-field"));
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		//Simple Form Demo
		WebElement selectAllbutton =driver.findElement(By.id("button-two"));
		//Select Input
		WebElement getAllsElected =driver.findElement(By.id("button-all"));
	}
	public void classId()
	{
		//List Box
		WebElement sumbitData=driver.findElement(By.className("btn btn-success btn-block"));
		WebElement datePicker=driver.findElement(By.className("form-control datepicker"));
		//Input Form-->Form Submit
		WebElement sumbitForm=driver.findElement(By.className("btn btn-primary"));
		//Others--> Dynamic Data Loading
		WebElement getNewUser=driver.findElement(By.className("btn btn-info"));
	}
	public void name()
	{
		WebElement name=driver.findElement(By.name("states[]"));
	}
	public static void main(String[] args) 
	{
		Locators obj=new Locators();
		obj.id();
		obj.classId();
		obj.name();
	}
}
