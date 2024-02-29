package java;

public class StringLearn {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub 
		String S1="hello";
		String S2="Friend";
		int a = 1;
		int b=2;
		
		System.out.println(S1+S2+a);		
		System.out.println(S1+S2+a+b);
		System.out.println(S1+S2+(a+b));
		System.out.println(a+b+S1+S2);
		System.out.println(a+S1+S2+b);		
		System.out.println("The no is:" + a);

		char c1='a';
		char c2='h';
		System.out.println(c1+c2);//
		
		System.out.println(c1+""+c2);//
		
		byte b1=50;
		byte b2=40;
		int b3=b1+b2;
		
		System.out.println(b3);//
		System.out.println(b1+b2);//

		System.out.println(10/2); //5
		System.out.println(10.0/2);//5.0
		System.out.println(10.0/2.0);//5.0
		System.out.println(10/2.0);//5.0
		System.out.println(0/9);//0
		//System.out.println(9/0);//0
		System.out.println(0.0/0);//Nan Not a number
		System.out.println(0/0.0);//Nan
		System.out.println(5/0.0);//infinity
		
		char t ='a';
		System.out.println((int)t);//
		
		//post increment
		int aa = 1;
		int bb = aa++;
		System.out.println(aa);//
		System.out.println(bb);//
				
		int g = -99;
		int h = g++;
		System.out.println(g);//
		System.out.println(h);//
		
		//pre increment
		int c=1;
		int d=++c;
		System.out.println(c);//
		System.out.println(d);//
		
		int m=-97;
		int n=++m;
		System.out.println(m);//
		System.out.println(n);//
		

	}

}
