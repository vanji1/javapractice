package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="I am am not the one who is thinking I one thing at time";
		String []ar = st.split("\\s");
		Map<String, Integer> mp= new HashMap<String, Integer>();
		int count=0;

		for(int i=0;i<ar.length;i++){
		    count=0;

		    for(int j=0;j<ar.length;j++){
		        if(ar[i].equals(ar[j])){
		        count++;                
		        }
		    }

		    mp.put(ar[i], count);
		}

		System.out.println(mp);

	}

}
