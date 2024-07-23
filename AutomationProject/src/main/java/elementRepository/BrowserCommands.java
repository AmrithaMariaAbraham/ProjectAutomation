package elementRepository;
public class BrowserCommands extends Base
{
	public void browserCommands()
	{
	  String title=	driver.getTitle();
	  System.out.println("Current title:"+title);
	  String url=driver.getCurrentUrl();
	  System.out.println("URL of current page:"+url);
	  String pagesource=driver.getPageSource();
	  System.out.println("PageSource:"+pagesource);
	}
	public static void main(String args[])
	{
		BrowserCommands obj=new BrowserCommands();
		obj.initializeBrowser();
		obj.browserCommands();
	}
}
