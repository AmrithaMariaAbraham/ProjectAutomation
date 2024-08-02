package elementRepository;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Table extends Base
{
	public void fullTableSelection()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fullTable=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println("Full Table:"+fullTable.getText());
	}
	public void getRow()
	{
		//Selecting a particular row from a table
		//tbody-->Table Body
		//tr-->table row
		WebElement getRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]"));
		System.out.println("Single Row:"+getRow.getText());
	}
	public void getColoumn()
	{
		List<WebElement> getColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		System.out.println("Single Coloumn:");
		for(WebElement column:getColumn)
		{
			System.out.println(column.getText());
		}
	}
	public void elementSearch()
	{
		String input="Junior Technical Author";
		List<WebElement> searchValue=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		System.out.println("Equal element searching:");
		for(WebElement value:searchValue)
		{
			if(value.getText().equals(input));
			{
				System.out.println(value.getText());
			}
		}
	}
	public void selectAValue()
	{
		WebElement value1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
		System.out.println("Particular Value:"+value1.getText());
	}
	public static void main(String[] args) 
	{
		Table table=new Table();
		table.initializeBrowser();
		table.fullTableSelection();
		System.out.println("*****************************************************");
		table.getRow();
		System.out.println("*****************************************************");
		table.getColoumn();
		System.out.println("*****************************************************");
		table.elementSearch();
		System.out.println("*****************************************************");
		table.selectAValue();
		table.driverQuitClose();
	}
}
