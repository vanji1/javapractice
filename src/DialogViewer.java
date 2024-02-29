import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogViewer
		{
		 public static void main(String[] args) throws MalformedURLException
		 {
		 String name = JOptionPane.showInputDialog("What is your name?");
		 System.out.println(name);
		// System.exit(0);
		 
		 URL imageLocation = new URL(
				 "https://duke.dev.java.net/images/iconSized/duke.gif");
				 JOptionPane.showMessageDialog(null, "Hello", "Title", 
				 JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
				 System.exit(0);
		 }
		}