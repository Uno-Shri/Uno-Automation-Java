package JavaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionCommands extends Base  {
	
	public void ActionMethod() throws InterruptedException
	{
		
		//TASK 1-TO GO AMAZON URL AND ACCOUNT&LIST PANEL AND SELECT ONE OPTION- Create a Wish List
		
		Thread.sleep(5000);
		
		//Note - driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();  -- this will click and goes to sign in option
		
		//Note - driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();--- doesn fine with text(),'creaete wish list'
		
		
		WebElement navIcon = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	
		WebElement elm1 = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		//System.out.println(elm1.getText());
		
		//Thread.sleep(3000);
		Actions act =new Actions(driver);
		act.moveToElement(navIcon).moveToElement(elm1).click().build().perform();
		
	
	}
	public void DragDropMethod() throws InterruptedException
	{   Thread.sleep(3000);
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capitalElm = driver.findElement(By.id("box1"));
		WebElement countyElm = driver.findElement(By.id("box101"));
		Actions act =new Actions(driver);
		act.dragAndDrop(capitalElm, countyElm).build().perform();
		System.out.println("completed"); 
		
		
		
	}
		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ActionCommands obj5=new ActionCommands();
		obj5.setupBrowser("chrome", "https://www.amazon.ca");
		obj5.ActionMethod();
		obj5.DragDropMethod();
		
		
	}

}
