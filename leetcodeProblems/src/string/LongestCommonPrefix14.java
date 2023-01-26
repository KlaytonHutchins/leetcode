package string;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		
		LongestCommonPrefix14 lcp = new LongestCommonPrefix14();
		String[] input1 = {"flower","flow","flight"};
		System.out.println("first: "+lcp.longestCommonPrefix(input1));
		String[] input2 = {"dog","racecar","car"};
		System.out.println("second: "+lcp.longestCommonPrefix(input2));
		String[] input3 = {"something","somethingelse","some"};
		System.out.println("third: "+lcp.longestCommonPrefix(input3));
		
	}
	
	public String longestCommonPrefix(String[] strs) {
		StringBuilder result = new StringBuilder();
		String firstStr = strs[0];
		outerLoop:
		for (int i = 0; i < firstStr.length(); i++) {
			result.append(firstStr.charAt(i));
			for (String string : strs) {
				if (i > string.length() - 1 || firstStr.charAt(i) != string.charAt(i)) {
					result.deleteCharAt(result.length()-1);
					break outerLoop;
				}
			}
			
		}
		return result.toString();
	}

}
