package leetcode._013.roman_to_int;

import java.util.HashMap;

public class Solution {

	/*
	 * Given a roman numeral, convert it to an integer.
	 * 
	 * Input is guaranteed to be within the range from 1 to 3999.
	 * 
	 * Show Tags
	 */
	private HashMap<Character, Integer> dict = new HashMap<Character,Integer>();
	{
		dict.put('I', 1);
		dict.put('V', 5);
		dict.put('X', 10);
		dict.put('L', 50);
		dict.put('C', 100);
		dict.put('D', 500);
		dict.put('M', 1000);
	}
	public int romanToInt(String s) {
		int ret =0;
		int last = 0;
		for(int i=s.length() -1 ;i>=0;i--){
			int current = dict.get(s.charAt(i));
			if(current >= last){
				ret += current;
			}else{
				ret -= current;
			}
			last=current;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.romanToInt("DCXXI"));
		System.out.println(s.romanToInt("MCMXCVI"));
		
	}
}
