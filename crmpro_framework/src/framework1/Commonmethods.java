package framework1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonmethods {

	public static void launching(String browser,String url) {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			Data.driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			Data.driver=new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			Data.driver=new InternetExplorerDriver();
			break;
			
		case "default":
			 Assert.assertTrue(false, "Given browser "+browser+" is invalid,browser is not launched");
			break;
			}
		Data.driver.get(url);
		Data.driver.manage().window().maximize();
		Data.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
}
