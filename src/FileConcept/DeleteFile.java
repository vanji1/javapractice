package FileConcept;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Vanji\\Desktop\\Hi.txt");
		if(file.delete()) {
			System.out.println("File deleted "+file.getName());
		}
		else{
				System.out.println("file not found");
			}
		}

	}

