package number;

public class SearchInsertPosition35 {

	public static void main(String[] args) {
		
		SearchInsertPosition35 sip = new SearchInsertPosition35();
		int[] in1 = {1,3,5,6};
		int ans1 = sip.searchInsert(in1, 5);
		int ans2 = sip.searchInsert(in1, 2);
		int ans3 = sip.searchInsert(in1, 7);
		System.out.println("Answer 1: " + ans1 + " --- Answer 2: " + ans2 + " --- Answer 3: " + ans3);
		
	}
	
	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
	}

}
