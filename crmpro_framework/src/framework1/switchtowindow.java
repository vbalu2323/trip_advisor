package framework1; 
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class switchtowindow {
	@Test
	public void switchwin() {
		Commonmethods.launching("chrome", "file:///C:/Users/murali%20dasari/Documents/switchtowindow.html");
		List<WebElement>allvalus=Data.driver.findElements(By.xpath("//a"));
		for (WebElement valus : allvalus) {
			valus.click();	
		}
		Set<String>handles=Data.driver.getWindowHandles();
		boolean isbrowserfound=false;
		for (String allhandles : handles) {
			Data.driver.switchTo().window(allhandles);
			String window=Data.driver.getTitle();
			if(window.contains("facebook")) {
				isbrowserfound=true;
				break;
			}	
		}
		Data.driver.close();
		handles=Data.driver.getWindowHandles();
		for (String allhandles : handles) {
			Data.driver.switchTo().window(allhandles);
			String window=Data.driver.getTitle();
			if(window.contains("twitter")) {
				isbrowserfound=true;
				break;
			}	
		}
		
		Data.driver.close();
		handles=Data.driver.getWindowHandles();
		for (String allhandles : handles) {
			Data.driver.switchTo().window(allhandles);
			String window=Data.driver.getTitle();
			if(window.contains("google")) {
				isbrowserfound=true;
				break;
			}
			
		}
		
	}
}
//List<WebElement> allvalus=Data.driver.findElements(By.xpath("//a"));
//
//for (WebElement vals : allvalus) {
//	vals.click();			
//}
//Set<String>allhandles=Data.driver.getWindowHandles();
//boolean isbrowserfound=false;
//for (String handle : allhandles) {
//	Data.driver.switchTo().window(handle);
//	String window=Data.driver.getTitle();
//	if(window.equalsIgnoreCase("facebook")) {
//		isbrowserfound=true;
//		break;
//	}	
//}
//Data.driver.close();
//allhandles=Data.driver.getWindowHandles();
//
//for (String handle : allhandles) {
//	Data.driver.switchTo().window(handle);
//	String window= Data.driver.getTitle();
//	if(window.contains("twitter")) {
//		isbrowserfound=true;
//		break;
//	}	
//}
//Data.driver.close();
//allhandles=Data.driver.getWindowHandles();
//for (String handle : allhandles) {
//	Data.driver.switchTo().window(handle);
//	String window=Data.driver.getTitle();
//	if(window.contains("google")) {
//		isbrowserfound=true;
//		break;
//	}	
//}
//Data.driver.close();
//
//}
//}	
//List<WebElement>allvalus=Data.driver.findElements(By.xpath("//a"));
//boolean isbrowserfound=false;
//for (WebElement valus : allvalus) {
//	String window=valus.getText();
//	if (window.contains("facebook")) {
//		valus.click();
//		isbrowserfound=true;
//		break;	
//	}	
//}
