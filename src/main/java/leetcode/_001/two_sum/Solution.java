package leetcode._001.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	/*
	 * Given an array of integers, find two numbers such that they add up to a
	 * specific target number.
	 * 
	 * The function twoSum should return indices of the two numbers such that
	 * they add up to the target, where index1 must be less than index2. Please
	 * note that your returned answers (both index1 and index2) are not
	 * zero-based.
	 * 
	 * You may assume that each input would have exactly one solution.
	 * 	
	 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] ret = new int[2];

		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			indexMap.put(numbers[i], i);
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			int x = target - numbers[i];
			Integer index = indexMap.get(x);
			
			if (index != null && index != i) {
				ret[0] = i + 1;
				ret[1] = index + 1;
				return ret;
			}
		}
		return ret;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] res = null;
		res = s.twoSum(new int[]{2,7,11,15}, 9);
		System.out.println(res[0] + "," + res[1]);
		
		res = s.twoSum(new int[]{2,7,11,15}, 13);
		System.out.println(res[0] + "," + res[1]);
		
		res = s.twoSum(new int[]{2,7,11,15}, 18);
		System.out.println(res[0] + "," + res[1]);
		
		res = s.twoSum(new int[]{2,7,11,15}, 17);
		System.out.println(res[0] + "," + res[1]);
		
		res = s.twoSum(new int[]{2,7,11,15}, 26);
		System.out.println(res[0] + "," + res[1]);
		
		//I did not accept this test case at first time
		res = s.twoSum(new int[]{3,2,4}, 6);
		System.out.println(res[0] + "," + res[1]);
	}
	
}
