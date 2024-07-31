package elementRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchingBrowser 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();//Launching Chrome browser
		driver.get("https://selenium.qabible.in/index.php");//Opening a website in Chrome browser
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
	}
}
