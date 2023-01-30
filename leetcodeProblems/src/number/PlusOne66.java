package number;

import java.util.Arrays;

public class PlusOne66 {

	public static void main(String[] args) {

		PlusOne66 po = new PlusOne66();
		int[] in1 = { 1, 2, 3 };
		int[] ans1 = po.plusOne(in1);
		int[] in2 = { 4, 3, 2, 1 };
		int[] ans2 = po.plusOne(in2);
		int[] in3 = { 9 };
		int[] ans3 = po.plusOne(in3);
		for (int i : ans1) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : ans2) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : ans3) {
			System.out.print(i);
		}
//		System.out.println("Answer 1: " + ans1[0] + "," + ans1[1] + "," + ans1[2] + "\nAnswer 2: " + ans2[0] + ","
//				+ ans2[1] + "," + ans2[2] + "," + ans2[3] + "\nAnswer 3: " + ans3[0] + "," + ans3[1]);

	}

	public int[] plusOne(int[] digits) {
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < digits.length; i++) {
			result[i + 1] = digits[i];
		}
		if (digits[digits.length - 1] != 9) {
			result[result.length - 1] = digits[digits.length - 1] + 1;
		} else {
			for (int i = result.length - 1; i >= 0; i--) {
				if (result[i] == 9) {
					continue;
				} else {
					result[i] = result[i] + 1;
					for (int j = i + 1; j < result.length; j++) {
						result[j] = 0;
					}
					break;
				}
			}
		}
		if (result[0] == 0) {
			result = Arrays.copyOfRange(result, 1, result.length);
		}
		return result;
	}

}
