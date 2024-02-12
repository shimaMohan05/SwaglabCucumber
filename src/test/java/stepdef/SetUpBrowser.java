package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpBrowser {
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	public static WebDriver setDriver()
	{
		driver=new ChromeDriver();
		System.out.println("session started");
		tdriver.set(driver); 
		return driver;
	}
	

}
