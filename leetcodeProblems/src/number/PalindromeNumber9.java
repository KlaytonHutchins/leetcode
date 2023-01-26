package number;

public class PalindromeNumber9 {

	public static void main(String[] args) {
		
		PalindromeNumber9 pn = new PalindromeNumber9();
		System.out.println(pn.isPalindrome(121));
		System.out.println(pn.isPalindrome(-121));
		System.out.println(pn.isPalindrome(10));
		System.out.println(pn.isPalindrome(123454321));
		System.out.println(pn.isPalindrome(12344321));
		
	}
	
	public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        for (int i = 0; i < str.length()/2; i++) {
        	if (str.charAt(i) != str.charAt(str.length() - (1 + i))) {
        		return false;
        	}
        }
        return true;
    }

}
