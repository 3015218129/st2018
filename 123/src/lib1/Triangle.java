package lib1;

public class Triangle {
	 public static String triganles (int a, int b, int c){
	        if(a+b > c && a+c > b && b+c > a){
	        if (a == b && b == c)
	            return "this is a equilateral triganle!";
	        else if (a == b || b == c || c == a)
	            return "this is a isosceles triganle!";
	        else
	            return "this is a scalene triganle!";
	            
	        }
	        else
	        return "this is not triganle!";
	    }

}
