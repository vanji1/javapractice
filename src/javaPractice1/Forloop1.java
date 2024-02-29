package javaPractice1;

public class Forloop1 {

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			System.out.print("*"+" ");
			for(int j=2;j<=7;j+=2) {
				System.out.print(j+" ");
			}
			System.out.print("*");
			System.out.println();
		}

	}

}
