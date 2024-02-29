package FileConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileConcept {

	public static void main(String[] args) {
		
		
		File file=new File("C:\\Users\\Vanji\\Desktop\\input.txt");
		
			try {
				
			Scanner scanner=new Scanner(file);
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
