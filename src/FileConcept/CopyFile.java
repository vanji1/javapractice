package FileConcept;

	import java.io.*;
	public class CopyFile {

	   public static void main(String args[]) throws IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("C:\\Users\\Vanji\\Desktop\\Hi.txt");
	         out = new FileOutputStream("C:\\Users\\Vanji\\Desktop\\output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}

