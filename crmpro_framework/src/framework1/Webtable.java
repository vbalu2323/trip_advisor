package framework1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Webtable {

	@Test
	public static void related_xpathfile() throws InterruptedException, IOException {
		List<String>contains=Reading_data_textfile.read_textfile("C:\\Users\\murali dasari\\eclipse-workspace\\crmpro_framework\\datafile.txt");
		Commonmethods.launching("chrome", "https://ui.cogmento.com/");
		Data.driver.findElement(By.name("email")).sendKeys("nandasele69@gmail.com");
		Data.driver.findElement(By.name("password")).sendKeys("Test@1234");
		Data.driver.findElement(By.xpath("//div[text()='Login']")).click();
		WebElement companylinks = Data.driver.findElement(By.xpath("//span[text()='Companies']"));
		Thread.sleep(3000);
		companylinks.click();
		Thread.sleep(2000);

		// Data.driver.findElement(By.xpath("//tr[text()='testcompany211595116']/following-sibling::td/decendent::i[contains(@class=
		// 'edit icon')]"));
		// Data.driver.findElement(By.xpath("//td[text()='testcompany211595116']/following
		// ::td[@class='right aligned collapsing
		// options-buttons-container']/a/button[@class='ui icon button'][1]")).click();
		// Data.driver.findElement(By.xpath("//td[text()='testcompany211595116']/following::td[@class='right
		// aligned collapsing options-buttons-container']/a/button[@class='ui icon
		// button'][1]")).click();
		// Data.driver.findElement(By.xpath("//td[text()='company0916126']/following::td[@class='right
		// aligned collapsing options-buttons-container']/a/button/i[@class='unhide
		// icon'][1]")).click();

		WebElement companydetails = Data.driver
				.findElement(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']"));

		Web_axis table = new Web_axis(companydetails);
		WebElement element=table.gettablerow("Name", "Company31431127");
		System.out.println(element.findElements(By.tagName("td")).size());
	}
}
