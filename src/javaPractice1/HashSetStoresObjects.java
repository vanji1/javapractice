package javaPractice1;

import java.util.HashSet;

public class HashSetStoresObjects {

	public static void main(String[] args) {
		
		 HashSet<Books> set=new HashSet<Books>();
		 Books b1=new Books(1,45,"C_Book","James");
		 Books b2=new Books(2,55,"Java_Book","Todd");
		 Books b3=new Books(3,15,"HTML_Book","Tom");
		 
		 set.add(b1);
		 set.add(b2);
		 set.add(b3);
		 for(Books b:set) {
		 System.out.println(b.id+" "+b.quantity+" "+b.bookName+" " +b.author);
		 }
	}

}

 class Books{
	
	 int id, quantity;
	 String bookName, author;
	 
	 public Books(int id, int quantity, String bookName,String author) {
		 this.id=id;
		 this.quantity=quantity;
		 this.bookName=bookName;
		 this.author=author;
	 }
 
	
}