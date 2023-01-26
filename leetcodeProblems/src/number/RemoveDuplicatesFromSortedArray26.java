package number;

public class RemoveDuplicatesFromSortedArray26 {

	public static void main(String[] args) {
		
		RemoveDuplicatesFromSortedArray26 rdfsa = new RemoveDuplicatesFromSortedArray26();
		int[] in1 = {1,1,2};
		int ans1 = rdfsa.removeDuplicates(in1);
		int[] in2 = {0,0,1,1,1,2,2,3,3,4};
		int ans2 = rdfsa.removeDuplicates(in2);
		System.out.println("Answer 1: " + ans1 + " --- Answer 2: " + ans2);
		
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
