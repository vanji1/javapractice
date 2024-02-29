package javaPractice1;

public class ReverseInteger {

	public static void main(String[] args) {
		
		
		
		int num =768787874;
	long r=0;
		
		while(num!=0) {
			r=r*10+num%10;
			num=num/10;
				
		}
System.out.println(r);

String s="hi how are you";
int num1 =768787874;
StringBuffer sb=new StringBuffer(String.valueOf(num1));
//sb.append("KKK");
	sb.reverse();
		System.out.println(sb);

	}
	
	

}
