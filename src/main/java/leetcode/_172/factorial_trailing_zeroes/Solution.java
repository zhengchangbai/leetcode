package leetcode._172.factorial_trailing_zeroes;

public class Solution {

	/*
	 * Given an integer n, return the number of trailing zeroes in n!.
	 * 
	 * Note: Your solution should be in logarithmic time complexity.
	 */
	public int trailingZeroes(int n) {

		int ret = 0;
		int t = 0;
		for(int i=0;i<=n;i++){
			t = i;
			while(t != 0){
				if(t % 5 == 0){
					ret ++;
					t /= 5;
				}else{
					break;
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println("0!="+s.trailingZeroes(0));
		System.out.println("5!="+s.trailingZeroes(5));
		System.out.println("10!="+s.trailingZeroes(10));
		System.out.println("12!="+s.trailingZeroes(12));
		System.out.println("13!="+s.trailingZeroes(13));
		System.out.println("14!="+s.trailingZeroes(14));
		System.out.println("15!="+s.trailingZeroes(15));
		System.out.println("16!="+s.trailingZeroes(16));
		System.out.println("20!="+s.trailingZeroes(20));
		System.out.println("25!="+s.trailingZeroes(25));
		System.out.println("26!="+s.trailingZeroes(26));
		System.out.println("27!="+s.trailingZeroes(27));
		System.out.println("28!="+s.trailingZeroes(28));
		System.out.println("30!="+s.trailingZeroes(30));
		
	}
	

}
