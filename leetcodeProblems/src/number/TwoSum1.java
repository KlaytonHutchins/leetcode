package number;

public class TwoSum1 {

	public static void main(String[] args) {
		
		TwoSum1 ts = new TwoSum1();
		int[] in1 = {2,7,11,15};
		int[] ans1 = ts.twoSum(in1, 9);
		int[] in2 = {3,2,4};
		int[] ans2 = ts.twoSum(in2, 6);
		int[] in3 = {3,3,3};
		int[] ans3 = ts.twoSum(in3, 6);
		System.out.println("Answer 1: " + ans1[0] + " + " + ans1[1] + "\nAnswer 2: " + ans2[0] + " + " + ans2[1] + "\nAnswer 3: " + ans3[0] + " + " + ans3[1]);
		
	}
	
	public int[] twoSum(int[] nums, int target) {
		int[] idxs = new int[2];
		outer:
		for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length; j++) {
					if (j == i) {
						continue;
					}
					if ((nums[i] + nums[j]) == target) {
						idxs[0] = i;
						idxs[1] = j;
						break outer;
					}
				}
		}
		return idxs;
	}

}
