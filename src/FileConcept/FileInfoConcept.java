package FileConcept;

import java.io.File;

public class FileInfoConcept {

	public static void main(String[] args) {

		File file=new File("C:\\Users\\Vanji\\Desktop\\output.txt");
		if(file.exists()) {
			System.out.println("Can Execute:"+file.canExecute());
			System.out.println("Can Read:"+file.canRead());
			System.out.println("Can Write:"+file.canWrite());
			System.out.println("get Absolute Path:"+file.getAbsolutePath());
			System.out.println("get File Name:"+file.getName());
			System.out.println("file last Modified:"+file.lastModified());
			System.out.println("getPath:"+file.getPath());
		}
	}

}
