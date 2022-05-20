package JavaAutomation;

import java.util.List;

//import java.awt.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.List;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base {






	public void DropDownMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		//xpath(//a[@id="u_0_2_dh"]));
		Thread.sleep(3000);

		Select month=	new Select(driver.findElement(By.xpath("//select[@id='month']")));

		month.selectByIndex(7);	  
		month.selectByValue("9");
		month.selectByVisibleText("Oct");

		//month.deselectByVisibleText("Oct");  doesnt work for single 


		//-----------------------------------------------------------------------------------------------------         	

		/* TO GET THE CURRENT SELECTED VALUE  */
		//Prints selected value but some tag is printed not the text like Oct
		//i.e. prints like [[[[[ChromeDriver: chrome on WINDOWS (bab698bad0bb807848a66f2c3c8ab45c)] -> xpath: //select[@id='month']]] -> tag name: option]]
		System.out.println(month.getAllSelectedOptions());


		//following will print the current/all- selected value of dropdwon (single level)
		List<WebElement> options=month.getAllSelectedOptions();
		for (WebElement elem : options) {
			System.out.println(elem.getText());
		}

		//-------------------------------------------------------------------------------------------------------      	
		//get the first selected option
		System.out.println(month.getFirstSelectedOption().getText());

		//-------------------------------------------------------------------------------------------------------
		//GET THE ALL DROP DOWN OPTIONS 	
		//get all the drop down options( irrespective of selected or not)
		List<WebElement> options2 = month.getOptions();
		for (WebElement elem2 : options2)
		{
			System.out.println(elem2.getText());
		}

		//--------------------------------------------------------------------------------------------------------            

           //to check if the dropdown given, is multi select or single one
		boolean result =month.isMultiple();
		
		System.out.println("is month dropdown multiple select-  " +result);
		//---------------------------------------------------------------------------------------------------------
		
		
//TUTORIAL DO MALABAR HILL GOLD WEBSITE for dorpdown and state
		

	}




	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		DropDownHandling obj4 = new DropDownHandling();
		obj4.setupBrowser("chrome", "https://www.facebook.com");
		obj4.DropDownMethod();
	}

}
