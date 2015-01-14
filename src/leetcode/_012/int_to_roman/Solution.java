package leetcode._012.int_to_roman;

public class Solution {

	/*
	 * Given an integer, convert it to a roman numeral.
	 * 
	 * Input is guaranteed to be within the range from 1 to 3999.
	 */

	private int[] ia = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

	private String[] ra = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

	public String intToRoman(int num) {

		StringBuilder ret = new StringBuilder();

		int x = num;
		int i = ia.length - 1;
		while (x != 0) {
			if (x - ia[i] >= 0) {
				ret.append(ra[i]);
				x = x - ia[i];
			} else {
				i--;
			}
		}
		return ret.toString();
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.intToRoman(1));
		System.out.println(s.intToRoman(4));
		System.out.println(s.intToRoman(5));
		System.out.println(s.intToRoman(9));
		System.out.println(s.intToRoman(10));
		System.out.println(s.intToRoman(11));
		System.out.println(s.intToRoman(14));
		System.out.println(s.intToRoman(15));
		System.out.println(s.intToRoman(39));
		System.out.println(s.intToRoman(399));
	}
}
