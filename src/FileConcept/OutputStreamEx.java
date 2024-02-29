package FileConcept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		
		try {
			
			FileOutputStream fs=new FileOutputStream("C:\\Users\\Vanji\\Desktop\\output.txt");
			String s="Hi how are you";
			byte[] b=s.getBytes();
			fs.write(b);
			fs.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
