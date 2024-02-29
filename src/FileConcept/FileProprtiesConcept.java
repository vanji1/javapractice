package FileConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProprtiesConcept {

	public static void main(String[] args)  {

		try {
			FileInputStream fis=new FileInputStream(".\\src\\FileConcept\\config.properties");
			
			Properties prop=new Properties();
			prop.load(fis);
			prop.list(System.out);
			System.out.println(prop.getProperty("headless"));
			System.out.println(prop.getProperty("password"));
			
			prop.setProperty("Value", "1");
			prop.store(new FileOutputStream(".\\src\\FileConcept\\config2.properties"), "comments");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
