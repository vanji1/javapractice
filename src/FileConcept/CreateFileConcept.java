package FileConcept;

import java.io.File;
import java.io.IOException;

public class CreateFileConcept {

	public static void main(String[] args) {
	
		
		
		File file=new File("C:\\users\\Vanji\\Desktop\\Hi.txt");
		
		try {
			boolean value=file.createNewFile();
			
			if(value) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
