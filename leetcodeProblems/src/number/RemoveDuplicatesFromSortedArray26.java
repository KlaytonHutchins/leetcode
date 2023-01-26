package number;

public class RemoveDuplicatesFromSortedArray26 {

	public static void main(String[] args) {
		
		RemoveDuplicatesFromSortedArray26 rdfsa = new RemoveDuplicatesFromSortedArray26();
		int[] in1 = {1,1,2};
		System.out.println(rdfsa.removeDuplicates(in1));
		int[] in2 = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(rdfsa.removeDuplicates(in2));
		
	}
	
	public int removeDuplicates(int[] nums) {
		int lastVal = -101;
		int nextIdx = 0;
		for (int i : nums) {
			if (lastVal != i) {
				nums[nextIdx] = i;
				lastVal = i;
				nextIdx++;
			}
		}
		return nextIdx;
	}

}
