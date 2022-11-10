package test.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	}
	
	public static int getMaxSum(int[] nums) {
		if (nums == null || nums.length == 0) {
			return Integer.MIN_VALUE;
		}
		
		if (nums.length == 1) {
			return nums[0];
		}
		
		int sum = nums[0];
		int temp = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (temp > 0) {
				temp += nums[i];
			} else {
				temp = nums[i];
			}
			
			if (sum < temp) {
				sum = temp;
			}
		}
		
		return sum;
	}
	
	public static boolean isPair(String s) {
		
		if (s == null || s.isEmpty() || s.length() == 1) {
			return false;
		}
		
		Map<Character, Character> map = new HashMap<>();
		map.put(']', '[');
		map.put(')', '(');
		map.put('}', '{');
		
		Stack<Character> stack = new Stack<>();
		
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				if (stack.isEmpty()) {
					return false;
				}
				
				if (map.get(c) != stack.pop()) {
					return false;
				}
			} else {
				stack.push(c);
			}
		}
		
		return stack.isEmpty();
	}
}
