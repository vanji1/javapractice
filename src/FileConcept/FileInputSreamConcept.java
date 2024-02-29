package FileConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputSreamConcept {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis=new FileInputStream("c:\\Users\\Vanji\\Desktop\\Hi.txt");
			int c=0;
			
			while((c=fis.read())!=-1) {
				System.out.print((char)c);	
			}
			fis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
