package bussinesflow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import framework1.Data;
import framework1.Eventmethods;

public class Bussiness {

	public static class login {
		public static void loginpage() throws InterruptedException {
			Thread.sleep(4000);
			WebElement username = Data.driver.findElement(By.xpath("//input[@name='username']"));
			Eventmethods.enter_the_value(username, "sudhananda123");
			Thread.sleep(4000);
			WebElement password = Data.driver.findElement(By.xpath("//input[@placeholder='Password']"));
			Eventmethods.enter_the_value(password, "Test@1234");
			Thread.sleep(4000);
			WebElement login = Data.driver.findElement(By.xpath("//input[@value='Login']"));
			Eventmethods.clickElement(login);
		}
	}

	public static class contactpage {
		public static void contactpage1() throws InterruptedException {
			Data.driver.switchTo().frame("mainpanel");
			Thread.sleep(5000);
			WebElement home = Data.driver.findElement(By.xpath("//a[text()='Home']"));
			Eventmethods.clickElement(home);
			Thread.sleep(4000);
			WebElement contact = Data.driver.findElement(By.xpath("//a[text()='Contacts']"));
			Eventmethods.move_to_element_with_offset(contact);

		}
	}

	public static class newcontact {
		public static void new_contactpage() throws InterruptedException {
			WebElement newcontact = Data.driver.findElement(By.xpath("//a[text()='New Contact']"));
			Eventmethods.clickElement(newcontact);
			Thread.sleep(4000);
			Eventmethods.clickElement(Data.driver.findElement(By.name("title")));
			List<WebElement> title = Data.driver.findElements(By.xpath("//select[@name='title']/option"));
			for (WebElement titles : title) {
				if (titles.getText().equalsIgnoreCase("dr.")) {
					titles.click();
					break;
				}
			}
			WebElement firstname = (Data.driver.findElement(By.id("first_name")));
			Eventmethods.enter_the_value(firstname, "murali");
			Eventmethods.clickElement(Data.driver.findElement(By.name("suffix")));
			List<WebElement> suffix = Data.driver.findElements(By.xpath("//select[@name='suffix']/option"));
			for (WebElement suffixs : suffix) {
				if (suffixs.getText().equalsIgnoreCase("II")) {
					suffixs.click();
					break;
				}
			}
			Eventmethods.clickElement(Data.driver.findElement(By.name("category")));
			List<WebElement> category = Data.driver.findElements(By.xpath("//select[@name='category']/option"));
			for (WebElement categorys : category) {
				if (categorys.getText().equalsIgnoreCase("Friend")) {
					categorys.click();
					break;
				}
			}
			Eventmethods.clickElement(Data.driver.findElement(By.name("status")));
			List<WebElement> status = Data.driver.findElements(By.xpath("//select[@name='status']/option"));
			for (WebElement statu : status) {
				if (statu.getText().equalsIgnoreCase("Inactive")) {
					statu.click();
					break;
				}
			}
		}

	}
}
