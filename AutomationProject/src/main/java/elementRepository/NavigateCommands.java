package elementRepository;
public class NavigateCommands extends Base
{
	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) 
	{
		NavigateCommands obj=new NavigateCommands();
		obj.initializeBrowser();
		obj.navigateCommands();	
		obj.driverQuitClose();
	}
}
