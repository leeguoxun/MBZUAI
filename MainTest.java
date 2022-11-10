package test.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

	@Test
	public void getMaxSum_bad() {
		int[] nums = new int[] {};
		assertEquals(Main.getMaxSum(nums), Integer.MIN_VALUE);
		
		nums = null;
		assertEquals(Main.getMaxSum(nums), Integer.MIN_VALUE);
	}
	
	@Test
	public void getMaxSum_good() {
		int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		assertEquals(Main.getMaxSum(nums), 6);
		
		nums = new int[] {1};
		assertEquals(Main.getMaxSum(nums), 1);
		
		nums = new int[] {5, 4, -1, 7, 8};
		assertEquals(Main.getMaxSum(nums), 23);
	}
	
	@Test
	public void isPair_true() {
		String s = "()";
		assertTrue(Main.isPair(s));
		
		s = "()[]{}";
		assertTrue(Main.isPair(s));

		s = "([]){}";
		assertTrue(Main.isPair(s));
	}
	
	@Test
	public void isPair_false() {
		String s = "";
		assertFalse(Main.isPair(s));
		
		s = null;
		assertFalse(Main.isPair(s));
		
		s = "(]";
		assertFalse(Main.isPair(s));
		
		s = "([]){}}";
		assertFalse(Main.isPair(s));
	}
}
