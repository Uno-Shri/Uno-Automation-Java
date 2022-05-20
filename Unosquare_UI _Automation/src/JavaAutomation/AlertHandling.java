package JavaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling extends Base{
	
	
	public void AlertMethod() throws InterruptedException
	
	{
		
		/*
		 * EXPAMPLE- GEENRAL CODE IF ANY WEBELEMENT TO MAKE SURE FULLY VISIBLE 
		 * WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement email =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		email.sendKeys("test@123.com");*/
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	
		String el1= driver.switchTo().alert().getText();
		System.out.println(el1);
		
	    System.out.println(driver.switchTo().alert().hashCode());
		driver.switchTo().alert().accept();
		
		//other alert operation based on alert type
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().sendKeys("Key sending demo");  //chrome doesnt support this function firefox can
		driver.quit();
		
	}
	
	public void ModalWindowAlert() throws InterruptedException {
	Thread.sleep(5000);
	//	WebDriverWait wait=new WebDriverWait(driver,10);
		//WebElement modalalert =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='ws-btn w3-dark-grey']"))));
		//modalalert.click();
		
		driver.findElement(By.xpath("//button[@class='ws-btn w3-dark-grey']")).click();
		
	
		
	//	driver.quit();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		AlertHandling obj2=new AlertHandling();
		//obj2.setupBrowser("chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		//obj2.AlertMethod();
		obj2.setupBrowser("chrome", "https://www.w3schools.com/howto/howto_css_modals.asp");
		obj2.ModalWindowAlert();
		
		
		
	}

}
