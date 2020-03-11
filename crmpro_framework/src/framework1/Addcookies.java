package framework1;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class Addcookies {
	
	@Test
	public static void Addcookie() {
		Commonmethods.launching("chrome", "https://www.facebook.com");
		Set<Cookie>cookies=Data.driver.manage().getCookies();
		System.out.println("count of cookies ="+ cookies.size());
		for (Cookie cookie2 : cookies) {
			System.out.println("Domain-"+cookie2.getDomain());
			System.out.println("name-"+cookie2.getName());
			System.out.println("path-"+cookie2.getPath());
			System.out.println("value-"+cookie2.getValue());
			System.out.println("class-"+cookie2.getClass());
			System.out.println("=============================");
		}
			Data.driver.manage().deleteAllCookies();
			
			Set<Cookie>deletecookie=Data.driver.manage().getCookies();
			System.out.println("count after delete ="+ deletecookie.size());
				
		}
	
	
//	@Test
//	public static void  assendingorder() {
//		int num[]= {1,3,5,2,10,4,6};
//		Arrays.sort(num);
//		for (int i = num.length-1; i >=0; i--) {
//			System.out.println(Array.getInt(num, i));
//			
//			
//		}
		
	}

