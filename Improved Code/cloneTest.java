package testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Main.cloneSure;

class cloneTest {

	@Test
	void test() {
		cloneSure clone = new cloneSure();
		double result[][] = {{1.0,2.0,3.0,4.0},{7.0,8.0,9.0,10.0}};
		double test[][];
		test = clone.clone(result);
		
		assertEquals(Arrays.deepToString(result),Arrays.deepToString(test));
		
	}

}
