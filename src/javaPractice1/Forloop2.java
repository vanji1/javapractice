package javaPractice1;

public class Forloop2 {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("******************");
		for (int k=0;k<4;k++) {
			for(int l=1;l<4;l++) {
				System.out.print(l+" "+l+" "+l+" ");
			}
			System.out.println();
		}
		System.out.println("******************");
		for (int m=10;m>5;m--) {
			int c=0;
			for(int n=10;n>=m;n--) {
				//System.out.print(m);
				c=c+1;
			}
			if(c==1) {
				System.out.print(" "+m);
			}else 
			if(c==2) {
				System.out.print(" "+" "+m);
			}else 
			if(c==3) {
				System.out.print(" "+" "+" "+m);
			}else 
			if(c==4) {
				System.out.print(" "+" "+" "+" "+m);
			}
			System.out.println();
		}
	}

}
