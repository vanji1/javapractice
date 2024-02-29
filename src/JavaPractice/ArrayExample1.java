package JavaPractice;

public class ArrayExample1 {

	public static void main(String[] args) {

		double[] values=new double[10];
		values[4]=10;
		System.out.println(values[4]);
		
		double[] age= {1,2,3,4,5,6,7,8,9,0};
		System.out.println(age.length);
		
		int[] scores= {9,1,1,1,1,1};
		ArrayExample1 a =new ArrayExample1();
		a.addScores(scores);
		
	}
		
		public void addScores(int[] values) {
			int totalscores=0;
			for(int i=0;i<values.length;i++) {
			totalscores=totalscores+values[i];
			}
			System.out.println(totalscores);	
	}

}
