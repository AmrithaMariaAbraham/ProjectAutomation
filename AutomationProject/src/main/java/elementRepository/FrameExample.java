package elementRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameExample 
{
	WebDriver driver;
	public void frameExample()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iFrame=driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(iFrame);//-->for those frame which doesnt go frame webpage 
		WebElement demoPage=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		demoPage.click();
		//iFrame.click();
	}
	public void javaTPoint()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.navigate().to("https://www.javatpoint.com/java-tutorial");	
	WebElement iframe=driver.findElement(By.id("google_ads_iframe_/103512698,22511567001/22964681174_0"));
	driver.switchTo().frame(iframe);
	
	}
	public void quit()
	{
		driver.quit();
	}
	public static void main(String[] args) 
	{
		FrameExample obj=new FrameExample();
		obj.frameExample();
		//obj.quit();
		//obj.javaTPoint();
	}
}
