package JavaPractice;

public class WrapperClass {

	public static void main(String[] args) {

	String x="100";
	System.out.println(x+20); //this will print 10020
	int i=	Integer.parseInt(x); //Integer is a class.ParseInt(string) will convert string to Int
	System.out.println(i+20); //this will print 120
	
	System.out.println(Integer.parseInt("1"));
	
	String y="12.33";
	System.out.println(y+20);
	double d= Double.parseDouble(y); 
	System.out.println(d+20);
	
	String total="1000";
	System.out.println(total+20);
	
	int total1= Integer.parseInt(total)+20;
	System.out.println(total1);
	
	String y1="12";
	System.out.println("String+Number: "+y1+20);
	double d1= Double.parseDouble(y1);
	System.out.println(d1+20);
	
	int ii=9/0;

//	String x1="100.0";
//	int i1=	Integer.parseInt(x1); //Integer is a class.ParseInt(string) will convert string to Int
//	System.out.println(i1+20); //this will print 120

	//Int to String
	int m=100;
	System.out.println(m+20); //output is 120
	
	String m1=	String.valueOf(m);
	System.out.println(m1+20);
	System.out.println();
	
	boolean b1=true;
	System.out.println(String.valueOf(b1));
	
	}
}
