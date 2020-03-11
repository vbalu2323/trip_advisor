package framework1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Normalclass {

	public void propertiesfile() {
		FileInputStream file = null;
		Properties prop = null;

		try {
			file = new FileInputStream(System.getProperty("user.dir") + "\\datafile.txt");
			prop = new Properties();
			prop.load(file);
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void intilazation(String browser, String url) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			Data.driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Data.driver = new FirefoxDriver();

		}
		Data.driver.manage().window().maximize();
		Data.driver.manage().deleteAllCookies();
		Data.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Data.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Data.driver.get(url);
	}

	public void caputure_screenshots(String imagename) {
		String imagepath = System.getProperty("user.dir") + "\\screenshort\\" + imagename + ".png";
		TakesScreenshot ts = (TakesScreenshot) Data.driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(imagepath);

		try {
			Files.copy(img, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
