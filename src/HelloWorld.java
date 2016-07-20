public class HelloWorld {
	public static void main(String[] args) {
		/* This is a comment, this will not be executed in Java */
		/* String - 1 */
		String myName = "Aubrey Martin";
		System.out.println(myName);
		
		/* String - 2 */
		String myBrothersName = "Anish Martin";
		System.out.println(myBrothersName);
		
		/* string - 3  */
		String myDadsName ="M.A.Nath";
		System.out.println(myDadsName);
		
		/* String - 4 */
		String myMomsName = "Antonette Martin";
		System.out.println(myMomsName);
		
		/* Addition */
		int a = 2; /* integer */
		int b = 3;
		int c = a + b;
		System.out.println("Addition of a: "+ a +" and b: " + b +" is c : " + c);
		
		/* Subtraction */
		int d = 3;
		int e = 2;
		int f = d - e;
		System.out.println("Subtraction of d: " + d + " and e: " + e + " is f : " + f); 
				
		
		/* Multiplication */
		int g = 2;
		int h = 2;
		int i = g * h;
		System.out.println("Multipliton of g: " + g + " and h:" + h +" is i: " + i);
		
		
		
		/* Division */
		int j = 4;
		int k = 2;
		int l = j / k;
		System.out.println("Division of j: " + j + " and k: " + k +" is l: " + l );
		
		/* Sequential Execution  */
		int p = 5;
		int q = 12;
		int r = p * p + q + 7;
		System.out.println("Sequential execution of p: " + p + " and q :" + q +" is r: " + r);
	
		
		/* Non - Sequential Execution < Skipped o = m > */
		int m = 5; //1
		int n = 12; //2
		int o; //3
		if (m > n){ //4
			o = m; 
		} else { //5
			o = n; //6
		}
		System.out.println("Non Sequential execution  and the value of O is: " + o);
	
		
	}
}
