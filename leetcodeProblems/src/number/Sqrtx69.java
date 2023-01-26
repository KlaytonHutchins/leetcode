package number;

public class Sqrtx69 {

	public static void main(String[] args) {
		
		Sqrtx69 sx = new Sqrtx69();
		int ans1 = sx.mySqrt(4);
		int ans2 = sx.mySqrt(8);
		System.out.println("Answer 1: " + ans1 + " --- Answer 2: " + ans2);
		
	}
	
	public int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}
		for (int i = 1; i < 46341; i++) {
			if (i > x / i) {
				return i - 1;
			}
		}
		return 46340;
	}

}
