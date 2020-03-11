package framework1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class Web_axis {
	
	private WebElement table;
	public  Web_axis(WebElement tablename) {
		table=tablename;
		String tagname=table.getTagName();
		if(!tagname.equalsIgnoreCase("table")) {
			throw new UnexpectedTagNameException("table", tagname);
		}	
	}
	public WebElement gettablerow(String columname,String value) {
		WebElement datarow=null;
		int colpos=rel_xpathfile(columname);
		if(colpos>=0) {
			List<WebElement>allrows=Data.driver.findElements(By.tagName("tr"));
			for (int i = 1; i<=allrows.size()-1; i++) {
				WebElement rows=allrows.get(i);
				List<WebElement>allcolums=rows.findElements(By.tagName("td"));
				if(allcolums.size()>=0) {
					WebElement colums=allcolums.get(colpos);
					String celltext=colums.getText();
					if(celltext.trim().equalsIgnoreCase(value)) {
						datarow=rows;
						break;
					}	
				}	
				
			}
			
		}
		else {
			System.out.println("the hgiven colum:"+columname+ "is not found");
		}
		return  datarow;
	}
	public  int rel_xpathfile(String columname) {
		int colindex=-1;
		WebElement  headerfile=table.findElement(By.tagName("tr"));
			List<WebElement> allheader=headerfile.findElements(By.tagName("th"));
				for (int i = 0; i < allheader.size()-1; i++) {
					WebElement allfiles=allheader.get(i);
					String getfile=allfiles.getText();
					System.out.println(getfile);
					if(getfile.trim().equalsIgnoreCase(columname)) {
						colindex=i;
						break;		
				}
			}
				return colindex;
				}
	

}
