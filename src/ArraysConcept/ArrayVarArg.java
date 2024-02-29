package ArraysConcept;

public class ArrayVarArg {

	public static void main(String[] args) {
		
	
		
		
		System.out.println(addScores(2,3,4,5));
		System.out.println(addScores(2,3,4));
		
	}
	public static int addScores(int... values) {
		int totals=0;
		double sum=1;
		for(int i=0; i<values.length;i++) {
			totals=totals+values[i];
			
		}
		
		return totals;
	}

}
