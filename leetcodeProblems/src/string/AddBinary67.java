package string;

public class AddBinary67 {

	public static void main(String[] args) {
		
		AddBinary67 ab = new AddBinary67();
		String ans1 = ab.addBinary("11", "1");
		String ans2 = ab.addBinary("1010", "1011");
		System.out.println("Answer 1: " + ans1 + " --- Answer 2: " + ans2);
		
	}
	
	public String addBinary(String a, String b) {
		String resultStr = "";
		boolean carryDigit = false;
		
		int difference = 0;
		if (b.length() < a.length()) {
			difference = a.length() - b.length();
			for (int i = 0; i < difference; i++) {
				b = "0" + b;
			}
		} else if (b.length() > a.length()){
			difference = b.length() - a.length();
			for (int i = 0; i < difference; i++) {
				a = "0" + a;
			}
		}
		
		for (int i = 0; i < a.length(); i++) {
			boolean aDigit = a.charAt(a.length() - 1 - i) == '1';
			boolean bDigit = b.charAt(b.length() - 1 - i) == '1';
			if (aDigit && bDigit && carryDigit) {
				resultStr = "1" + resultStr;
				carryDigit = true;
			} else if ((aDigit && bDigit && !carryDigit) || (aDigit && !bDigit && carryDigit) |(!aDigit && bDigit && carryDigit)) {
				resultStr = "0" + resultStr;
				carryDigit = true;
			} else if ((aDigit && !bDigit && !carryDigit) || (!aDigit && bDigit && !carryDigit) |(!aDigit && !bDigit && carryDigit)) {
				resultStr = "1" + resultStr;
				carryDigit = false;
			} else {
				resultStr = "0" + resultStr;
				carryDigit = false;
			}
		}
		if (carryDigit) {
			resultStr = "1" + resultStr;
			carryDigit = false;
		}
		return resultStr;
	}

}
