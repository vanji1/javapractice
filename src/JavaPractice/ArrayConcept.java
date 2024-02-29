package JavaPractice;

public class ArrayConcept {

	public static void main(String[] args) {
		//limitation of array
		//1.size is fixed. static array : to solve this problem we use dynamic array
		//2.can store only similar type of values, to solve this we can use static object array

		//int array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[0]+i[2]);
		//System.out.println(i[4]);//ArraIndexyoutofBoundException
		//System.out.println(i[-1]);//ArraIndexyoutofBoundException
		
		System.out.println(i.length);
		

		
	
		//doule array
		
		double d[]=new double[5];
		d[0]=100.00;
		d[1]=101.00;
		d[2]=103.00;
		System.out.println(d[0]);
		
		
		// 3.String array
		String s[]=new String[3];	
		s[0]="Hi";
		s[1]="how";
		s[2]="are";
		
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
			
		
		// 4.Object Array
		Object emp[]=new Object[5];
		emp[0]="Godo";
		emp[1]=21;
		emp[2]='m';
		emp[3]=true;
		emp[4]=5.5;
		
		System.out.println(emp[4]);
		
		for(int i1=0; i1<emp.length;i1++) {
			System.out.println(emp[i1]);
		}
		
		for(Object o:emp) {  //for each loop for obj array
			System.out.println(o);
		}
		
		
	}

}
