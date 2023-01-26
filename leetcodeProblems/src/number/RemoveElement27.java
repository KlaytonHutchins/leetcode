package number;

public class RemoveElement27 {

	public static void main(String[] args) {
		
		RemoveElement27 re = new RemoveElement27();
		int[] in1 = {3,2,2,3};
		int ans1 = re.removeElement(in1, 3);
		int[] in2 = {0,1,2,2,3,0,4,2};
		int ans2 = re.removeElement(in2, 2);
		System.out.println("Answer 1: " + ans1 + " --- Answer 2: " + ans2);
		
	}
	
	public int removeElement(int[] nums, int val) {
		int nextIdx = 0;
		for (int i : nums) {
			if (val != i) {
				nums[nextIdx] = i;
				nextIdx++;
			}
		}
		return nextIdx;
	}

}
