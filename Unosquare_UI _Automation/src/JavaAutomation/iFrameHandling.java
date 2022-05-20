package JavaAutomation;

import org.openqa.selenium.By;

public class iFrameHandling extends Base{

	
	public void iframeMethod() throws InterruptedException
	{
		
		//TO SHOW LEFT SIDE PANEL BUTTONS ARE ACCESSED WITHOUT FRAME SINCE THEY ARE SITTING ON BASE DEFAULT FRAME
		//driver.findElement(By.id("//button[@onclick='myFunction()']")).click();
		//driver.findElement(By.id("tryhome")).click();
		
		
		//frame(0) DOESNT WORK
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains((text()),'Try it')]")).click();
		
		
		//driver.quit();
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		iFrameHandling obj3= new iFrameHandling();
		obj3.setupBrowser("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		obj3.iframeMethod();
		

	}

}
