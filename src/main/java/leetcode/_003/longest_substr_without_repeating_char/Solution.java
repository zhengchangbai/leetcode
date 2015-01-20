package leetcode._003.longest_substr_without_repeating_char;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution {

	/*
	 * Given a string, find the length of the longest substring without
	 * repeating characters. For example, the longest substring without
	 * repeating letters for "abcabcbb" is "abc", which the length is 3. For
	 * "bbbbb" the longest substring is "b", with the length of 1.
	 */
	public int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int maxLen = 0;
		int delIndex = 0;
		
		for(int i=0;i<s.length();i++){
			Integer index = map.get(s.charAt(i));
			if(index != null){
				while(delIndex <= index){
					map.remove(s.charAt(delIndex));
					delIndex++;
				}
				
			}
			map.put(s.charAt(i), i);
			maxLen = maxLen < map.size() ? map.size() : maxLen;
		}
		
		return maxLen;
	}
	
	@Test
	public void test(){
		Solution s = new Solution();
		assertEquals(1,s.lengthOfLongestSubstring("bbbbb"));//b

		assertEquals(3,s.lengthOfLongestSubstring("abcabcbb"));//abc or bca or cab

		assertEquals(5,s.lengthOfLongestSubstring("abacdeafa"));//bacde or cdeaf
	}
	
}
