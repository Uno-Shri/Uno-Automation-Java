package JavaAutomation;
import org.openqa.selenium.WebElement;

public class NavigationCommands extends Base
{

	
	public static NavigationCommands obj1;









	public void navigation () throws InterruptedException
	
	{
		Thread.sleep(3000);
		
	driver.navigate().to("https://www.amazon.com");        
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	
	driver.quit(); 
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		NavigationCommands.obj1 = new NavigationCommands();
		obj1.setupBrowser("chrome", "https://www.facebook.com");
		obj1.navigation();
		
		
		
	}

}
