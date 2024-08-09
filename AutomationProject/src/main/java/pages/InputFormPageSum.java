package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class InputFormPageSum 
{
	WebDriver driver;
	public InputFormPageSum(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//defining Page Factory[is a class]
	}
	
    @FindBy(xpath="//input[@id='value-a']") WebElement valueA;
    @FindBy(xpath="//input[@id='value-b']") WebElement valueB;
    @FindBy(xpath="//button[@id='button-two']") WebElement getTotal;
    
    public void enterValueforA(String valuea)
    {
    	valueA.sendKeys(valuea);
    }
    public void enterValueforB(String valueb)
    {
    	valueB.sendKeys(valueb);
    }
    public void gettotalClick()
    {
    	getTotal.click();
    }
}
