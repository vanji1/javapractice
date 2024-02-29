package FileConcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileReaderConcept {

	public static void main(String[] args) throws IOException {
		System.out.println("Progaram starts.......");
		
		File f = new File("C:\\desktop\\test\\javatest.txt"); //another way it takes also file or string 
		FileWriter fw= new FileWriter(f);
	//	FileWriter fw= new FileWriter("C:\\desktop\\test\\javatest.txt");
		fw.write("Hell this is my file.. I am writing using FileWriter");
		fw.append("Hello Again");
		fw.write("char methodddd");
	
		fw.close();
		System.out.println("Progaram ends.......");

	}

}
