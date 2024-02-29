package FileConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFileStreamConcept {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in=new FileInputStream("C:\\Users\\Vanji\\Desktop\\output.txt");
			out=new FileOutputStream("C:\\Users\\Vanji\\Desktop\\input.txt");
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in!=null) {
				in.close();					
				}
			if(out!=null) {
				out.close();
			}
		}
	}

}
