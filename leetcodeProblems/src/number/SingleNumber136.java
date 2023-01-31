package number;

public class SingleNumber136 {

	public static void main(String[] args) {

		SingleNumber136 sn = new SingleNumber136();
		int[] in1 = { 2, 2, 1 };
		int ans1 = sn.singleNumber(in1);
		int[] in2 = { 4, 1, 2, 1, 2 };
		int ans2 = sn.singleNumber(in2);
		int[] in3 = { 1 };
		int ans3 = sn.singleNumber(in3);
		System.out.println("Answer 1: " + ans1 + "\nAnswer 2: " + ans2 + "\nAnswer 3: " + ans3);

	}

	public int singleNumber(int[] nums) {
		outer: for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				} else {
					if (nums[i] == nums[j]) {
						continue outer;
					} else if (j == nums.length - 1) {
						return nums[i];
					}
				}
			}
		}
		return nums[nums.length - 1];
	}

}
