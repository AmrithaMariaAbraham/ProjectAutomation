package testCasesExecute;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class ObsquraBaseClass 
{ 
	WebDriver driver;
    @BeforeMethod
	  public void beforeMethod() 
      {
    	driver=new ChromeDriver();
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	driver.manage().window().maximize();
    	//implicit wait Duration-->Class ofSeconds-->Static method
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }	
	  @AfterMethod
	  public void afterMethod() 
	  {
		  driver.quit();
	  }
}
