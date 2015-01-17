package leetcode._007.revert_integer;

/**
 * 
 * @author zhengchangbai
 */

public class Solution {
	
	/*
	 * Reverse digits of an integer.
	 * 
	 * Example1: x = 123, return 321 Example2: x = -123, return -321
	 */
	private static int BAND_MAX = Integer.MAX_VALUE / 10;
	private static int BAND_MIN = Integer.MIN_VALUE / 10;
	
	public int reverse(int x) {
        int ret = 0;
        while( x != 0){
        	if( ret >  BAND_MAX|| ret< BAND_MIN){
        		return 0;
        	}
        	ret = ret * 10  + x % 10;
        	x /= 10;
        }
        return ret;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.reverse(-100));
		System.out.println(s.reverse(Integer.MAX_VALUE));
		System.out.println(s.reverse(-123));
		System.out.println(2147483641);
	}
}
