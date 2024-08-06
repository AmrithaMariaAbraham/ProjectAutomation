package elementRepository;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadExample 
{
	WebDriver driver;
	public void fileUpload()//--sendskeys,robot class
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement selectPDF=driver.findElement(By.id("file-upload"));
		//selectPDF.click();
		selectPDF.sendKeys("C:\\Users\\amrit\\Downloads\\Divisible.pdf");
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.click();		
	}
	public void robotClassExample() throws AWTException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement selectPDF=driver.findElement(By.id("file-upload"));
		selectPDF.click();
		StringSelection stringSelect=new StringSelection("C:\\Users\\amrit\\Downloads\\Divisible.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelect,null);//paste the above path in to clipboard
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Assignment-->Robot class for New Tab
	}
	public void newTab() throws AWTException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	public static void main(String[] args) throws AWTException
	{		
		FileUploadExample obj=new FileUploadExample();
		//obj.fileUpload();
		//obj.robotClassExample();
		obj.newTab();
	}
}
