package testcases;


import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import Main.Log;


public class LogTest {

	@Test
	void test() {
		Log testing = new Log();
		double function;
		double result = Double.NaN;
		function = testing.calculateLog(0.0);
		System.out.print(function);
		assertEquals(result,function,0.0);
	
		
		
	}

}



