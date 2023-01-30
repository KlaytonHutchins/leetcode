package string;

public class LengthOfLastWord58 {

	public static void main(String[] args) {
		
		LengthOfLastWord58 lolw = new LengthOfLastWord58();
		int ans1 = lolw.lengthOfLastWord("Hello World");
		int ans2 = lolw.lengthOfLastWord("   fly me   to   the moon  ");
		int ans3 = lolw.lengthOfLastWord("luffy is still joyboy");
		System.out.println("Answer 1: " + ans1 + "\nAnswer 2: " + ans2 + "\nAnswer 3: " + ans3);
		
	}
	
	public int lengthOfLastWord(String s) {
		int result = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				if (result == 0) {
					continue;
				} else {
					break;
				}
			} else {
				result++;
			}
		}
		return result;
	}

}
