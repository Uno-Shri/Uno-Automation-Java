package JavaAutomation;


import JavaAutomation.Base;
import JavaAutomation.BrowserCommands;

//shrikant -test proect 5 april

public class BrowserCommands extends Base {
	
	public void getCommand() {

		driver.get("https://www.amazon.com/");

	}

	public void getTitleExample() {
		String title = driver.getTitle();
		System.out.println("page title = " + title);

	}


	public void getCurrentUrlExample() {
		String url = driver.getCurrentUrl();
		System.out.println("url = "+url);
	}

	public void getPageSourceExample() {
		String source = driver.getPageSource();
		//System.out.println(source);
		System.out.println(source.contains("Facebook � Log In or Sign Up"));

		//� Log In or Sign Up
	}

	public void closeExample() {

		//thread.sleep is only for demo purpose
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

	void quitExample() {
		//thread.sleep is only for demo purpose
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

		}

		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserCommands obj = new BrowserCommands();
		obj.setupBrowser("chrome", "https://www.facebook.com");

		obj.getCommand();
		obj.getTitleExample();
		obj.getCurrentUrlExample();
		obj.getCommand();
		obj.getTitleExample();
		obj.getPageSourceExample();
		System.out.println("back in main");
		obj.closeExample();
		obj.quitExample();
			
		
	}

}
