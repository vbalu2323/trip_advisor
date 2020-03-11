package framework1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Reading_data_textfile {

	public static List<String> read_textfile(String filepath) throws IOException {
		File file=new File(filepath);
		List<String>alldata=new ArrayList<>();
		if(file.exists()) {
			Scanner scan=new Scanner(file);
			
			while (scan.hasNext()) {
				alldata.add(scan.next());	
			}
		}else {
			System.out.println("filename:"+file+"doenot file");
		}
		return alldata;	
	}
	
	public static  void reading_data_properties(String filepath) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\datafile.txt");
		Properties prop=new Properties();
		prop.load(file);	
		
	}
	

}
