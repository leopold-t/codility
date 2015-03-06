class Solution {
	public int solution(IntList L) {
		int result = 0;

		if(null != L){
			result = 1;
		}
		else{
			return 0;
		}

		while(null != L.next){
			L = L.next;
			result++;
		}

		return result;
	}
}

class IntList {
	public int value;
	public IntList next;
}