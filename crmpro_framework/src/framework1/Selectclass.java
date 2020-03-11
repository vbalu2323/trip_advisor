package framework1;

import org.openqa.selenium.By;


public class Selectclass {

	public static void main(String[] args) {
		Commonmethods.launching("chrome","https://crmpro.com");
		Data.driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sudhananda123");
		Data.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@1234");
		Data.driver.findElement(By.xpath("//input[@type='submit']")).click();
		Data.driver.findElement(By.xpath("//td[@class='logo_text']")).isDisplayed();
		Data.driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Data.driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	}

}
