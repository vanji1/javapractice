package InterviewQuestions;

import java.util.Arrays;

public class FindSmallestandLargestinArray {

	public static void main(String[] args) {

		
	//here we will take the first number in the array and check if it is large in the array

	int[] numbers= {10,4,6,7,8,93,2};
	
	int largest=numbers[0];
	int smallest=numbers[0];
	
	for(int i=1;i<numbers.length;i++) {
		if (numbers[i]>largest) {
			largest=numbers[i];
		}
			else if(numbers[i]<smallest){
				smallest=numbers[i];				
			}
				}
	
	
	System.out.println(Arrays.toString(numbers));
	
	System.out.println("The largest no is: "+largest);
	System.out.println("The largest no is: "+smallest);
	}
	
	}


