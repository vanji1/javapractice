package JavaCourse;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n=350;
		double p=0;
		int n1=0;
		
		if(n<=300) {
			p=29.95;
		}
		if(n>300) {
			p=29.95;
				n1=n-300;
				for(int i=1;i<=n1;i++) {
					p=p+0.45;
				}
			}
		System.out.println(p);
		}

}

