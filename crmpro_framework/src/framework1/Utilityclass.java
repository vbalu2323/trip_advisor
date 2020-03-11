package framework1;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Utilityclass {
	
	public  static void createdfolder(String folderpath) {
		File file=new File(folderpath);
		if(!file.exists()) {
			file.mkdirs();	
		}
	}
	public static String gettimestamp() {
		String timestamp="";
		Date d = new Date();
		Calendar c=Calendar.getInstance();
		timestamp=timestamp+c.get(Calendar.HOUR)+c.get(Calendar.MINUTE)+c.get(Calendar.SECOND);
		return timestamp;	
	}
	public static String capturescreenshort(String screenshortname) throws IOException {
		createdfolder(System.getProperty("user.dir")+"\\screenshorts\\");
		TakesScreenshot ts=(TakesScreenshot) Data.driver;
		screenshortname=screenshortname+gettimestamp()+".png";
		File image=ts.getScreenshotAs(OutputType.FILE);
		String destpath=System.getProperty("user.dir")+"\\screenshorts\\"+screenshortname;
		File destPath=new File(destpath);
	
		FileUtils.moveDirectory(image, destPath);
		return destpath;
		
	}
		
	}
	
	


