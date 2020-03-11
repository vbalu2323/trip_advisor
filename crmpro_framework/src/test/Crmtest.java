package test;
import org.testng.annotations.Test;
import bussinesflow.Bussiness;
import framework1.Commonmethods;

public class Crmtest {
	
	
	@Test(priority = 1)
	public void launch() {
		
		Commonmethods.launching("chrome", "https://www.crmpro.com");
	}
	
	@Test(priority = 2)
	public void bussinessmethods() throws InterruptedException {
		Bussiness.login.loginpage();
		Bussiness.contactpage.contactpage1();
		Bussiness.newcontact.new_contactpage();

	}

}
