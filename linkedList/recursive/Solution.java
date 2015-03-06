class Solution {
	public int solution(IntList L) {
		int result = 0;

		if(null != L){
			result++;

			if(null != L.next){
				result = result + this.solution(L.next);
			}
		}

		return result;
	}
}

class IntList {
	public int value;
	public IntList next;
}