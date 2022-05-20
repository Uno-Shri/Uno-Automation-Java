package JavaAutomation;
//open cmd -to terminate all -> taskkill /F /IM chromedriver.exe /T
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;

	public void setupBrowser(String browser, String url) {
		String currDir = System.getProperty("user.dir");

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Valid browser was not provided, hence quitting the automation run");
			System.exit(0);
		}

		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
}