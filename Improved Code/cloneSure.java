package Main;

import java.util.Arrays;

public class cloneSure {
	
	
    public static double[][] clone(double[][] source) {
        double[][] clone = new double[source.length][];
        for (int i = 0; i < source.length; i++) {
            if (source[i] != null) {
               clone[i] = source[i];
               
                
            }
        }
        
        return clone;
    }
    
    public static void main(String[] args)
    {
    	double [][] test = {{1,2,3,4},{7,8,9,10}};
    	System.out.println(Arrays.deepToString(clone(test)));
    }

}
