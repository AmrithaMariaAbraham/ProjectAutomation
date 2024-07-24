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
	public void linkText()
	{
		//Home-->Checkbox Demo(link)
		WebElement checkBoxLink=driver.findElement(By.linkText("check-box-demo.php"));
		//Input forms-->Radio Button Link
		WebElement radioButtonLink=driver.findElement(By.linkText("radio-button-demo.php"));
		//Input Forms--> Select Input Link
		WebElement SelectInput=driver.findElement(By.linkText("select-input.php"));
		//Input Form--: Jquery select2
		WebElement JquerySelect=driver.findElement(By.linkText("jquery-select.php"));		
	}
	public void partialLinkText()
	{
		WebElement radioButton=driver.findElement(By.partialLinkText("radio-button"));
		//Table-->Table Sort and Search Link
		WebElement tableSortSearch=driver.findElement(By.partialLinkText("table-sort"));
		//Table-->table filter link
		WebElement tableFilter=driver.findElement(By.partialLinkText("table-filter"));
		//Table--> table Data Download link
		WebElement tableDataDownload=driver.findElement(By.partialLinkText("table-data"));		
	}
	public void cssSelector()
	{
		WebElement element2=driver.findElement(By.cssSelector("input#gridCheck"));//attribute tag#Id-->Method 1 for cssSelector
		WebElement element3=driver.findElement(By.cssSelector("input.form-check-input")); //tag.class-->Method2 for cssSelector
		WebElement element4=driver.findElement(By.cssSelector("input[class=form-check-input]"));//tag[attribute type=attribute value]-->Method3 for cssSelector
		WebElement element5=driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]")); //tag.class attribute value[attribute tag=attribute value]
		//InputForm-->Message field
		WebElement message=driver.findElement(By.cssSelector("input#single-input-field"));
	}
	public void xpath()
	{
		WebElement element6=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));//Absolute xpath-->will get from root node
		WebElement element7=driver.findElement(By.xpath("//input[@class='form-check-input']"));//relative xpath
		//Input form-->Message
		WebElement mesg=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//Input form--> Show Message button
		WebElement showMessage =driver.findElement(By.xpath("//button[@id='button-one']"));
		//Input Forms-->get Total button
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	}
	public static void main(String[] args) 
	{
		Locators obj=new Locators();
		obj.id();
		obj.classId();
		obj.name();
		obj.linkText();
		obj.partialLinkText();
		obj.cssSelector();
		obj.xpath();
	}
}
