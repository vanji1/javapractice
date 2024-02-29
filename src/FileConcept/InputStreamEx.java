package FileConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		
		
	try {
		
		FileInputStream fs=new FileInputStream("C:\\Users\\Vanji\\Desktop\\output.txt");
	//	boolean i=fs.read();//read i byte
		int i=0;
		while((i=fs.read())!=-1) {
			System.out.print( (char)i);
		}
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}

	}

}
