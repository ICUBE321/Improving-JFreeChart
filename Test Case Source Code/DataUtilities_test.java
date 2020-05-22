package testcase;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class DataUtilities_test {

	double[][] a = {{1,2,3,4}};
	double[][] b = {{4,3,2,1}};
	double[][] c;
	double[][] d;
	double[][] e = {{1.0,2.0},{0.0,4.0}};
	double[][] b1 = {{4,3,2,1}};
	
	@Test
	public void equal_test() {
		boolean equal;
		equal = DataUtilities.equal(a, b);
		assertEquals(false, equal);
		
		equal = DataUtilities.equal(a,c);
		assertEquals(false, equal);
		
		equal = DataUtilities.equal(c,b);
		assertEquals(false, equal);
		
		equal = DataUtilities.equal(c,d);
		assertEquals(true, equal);
		
		equal = DataUtilities.equal(a,e);
		assertEquals(false, equal);
		
		equal = DataUtilities.equal(b,b1);
		assertEquals(true, equal);
	}
	
	@Test
	public void clone_test() {
		boolean same;
		double[][] clone = DataUtilities.clone(a);
		double[][] clone2 = DataUtilities.clone(e);
		//printing original and cloned arrays
		
		//for e
		System.out.print("Original array e: ");
		for(double[] row:e) {
			for(double value:row) {
				System.out.print(value+" ");
			}
			System.out.print(",");
		}
		System.out.print(" Length: " + e.length);
		
		System.out.println();
		System.out.print("Clone of e: ");
		for(double[] row:clone2) {
			for(double value:row) {
				System.out.print(value+" ");
			}
			System.out.print(",");
		}
		System.out.println(" Length: " + clone2.length);
		
		
		//for a
		System.out.print("Original array a: ");
		for(double[] row:e) {
			for(double value:row) {
				System.out.print(value+" ");
			}
			System.out.print(",");
		}
		System.out.print(" Length: " + e.length);
		
		System.out.println();
		System.out.print("Clone of a: ");
		for(double[] row:clone2) {
			for(double value:row) {
				System.out.print(value+" ");
			}
			System.out.print(",");
		}
		System.out.print(" Length: " + clone2.length);
		
		same = clone.equals(a);
		assertEquals(true, same);
		
		same = clone2.equals(e);
		assertEquals(true, same);
		
		
	}
		
}
