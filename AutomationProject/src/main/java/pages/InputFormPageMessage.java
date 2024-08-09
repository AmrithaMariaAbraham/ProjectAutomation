package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPageMessage 
{
	WebDriver driver;
	public InputFormPageMessage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='single-input-field']") WebElement message;
	@FindBy(xpath="//button[@id='button-one']") WebElement showMessage;
	
	public void enterMessage(String Message)
	{
		message.sendKeys(Message);
	}
	public void showMessageClick()
	{
		showMessage.click();
	}
}
