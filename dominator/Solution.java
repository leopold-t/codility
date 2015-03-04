import java.util.*;

public class Solution
{
	public int solution(final int[] A) {
		Map<Integer, Integer> valuesMap = new HashMap<Integer, Integer>();
		Integer arrayValue	= new Integer(0);
		Integer occurrence	= new Integer(0);
		double arrayLength	= A.length;
		int occurrenceLimit	= 0;
		int result			= -1;

		occurrenceLimit = (int)Math.ceil(arrayLength / 2);

		if(A.length == (occurrenceLimit * 2)){
			occurrenceLimit++;
		}

		for(int i = 0; i < A.length; i++){
			arrayValue = A[i];

			if(valuesMap.containsKey(arrayValue)){
				occurrence = valuesMap.get(arrayValue);
				occurrence++;
				valuesMap.put(arrayValue, occurrence);
			}
			else{
				valuesMap.put(arrayValue, 1);
				occurrence = 1;
			}

			if(occurrence >= occurrenceLimit){
				result = i;
				break;
			}
		}

		return result;
	}
}