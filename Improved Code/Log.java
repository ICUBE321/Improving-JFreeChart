package Main;

public class Log {

	static int baselog = 10;

	  public double calculateLog(double value) {
		  double result = 0;
		   
		  if(value <= 0)
		   {
			   result = Double.NaN;
		   }
		   else {
			   result =  Math.log(value) / baselog;
		   }
		return result;
	        
	    }

}


