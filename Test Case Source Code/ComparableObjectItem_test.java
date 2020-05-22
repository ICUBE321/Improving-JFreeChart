package testcase;

import static org.junit.Assert.*;

import org.jfree.data.ComparableObjectItem;
import org.junit.Test;

public class ComparableObjectItem_test {
	
	Comparable<Integer> comp_x = 7;
	Object obj_y = "string";
	Object target = "different";
	
	public ComparableObjectItem test1 = new ComparableObjectItem(comp_x, obj_y);
	
	//compare different object
	@Test
	public void test1() {
		int actual;
		boolean result;
		actual = test1.compareTo(target);
		result = test1.equals(target);
		assertEquals(true, (actual != 0));
		assertEquals(false, result);
	}
	
	
	public ComparableObjectItem test2 = new ComparableObjectItem(comp_x, "different");
	
	//compare similar object
		@Test
		public void test2() throws CloneNotSupportedException {
			ComparableObjectItem comp = new ComparableObjectItem(7, obj_y);
			ComparableObjectItem comp2 = new ComparableObjectItem(5, obj_y);
			int actual;
			boolean result;
			actual = test2.compareTo(comp);
			result = test2.equals(test2);
			//System.out.print("Actual is: "+ actual);
			assertEquals(true, (actual == 0));
			assertEquals(true, result);
			
			result = test2.equals(test1);
			assertEquals(false, result);
			
			result = test2.equals(comp2);
			assertEquals(false, result);
			
			ComparableObjectItem clone = (ComparableObjectItem) test2.clone();
			result = test2.equals(clone);
			assertEquals(true, result);
		}

}
