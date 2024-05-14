package practice.oops.test;

public class FactorialExample {
	
	//nonrecursive factorial
	public static int factorial(int num) {
		
		int result = 1;
		for(int i=1 ;i <= num ; i++) { 
			result= result*1;
		}
		
		return result;
		
	}
	//recurssive factorial
	public static int recursiveFactorial(int num) {
		
		if(num == 0) {
			return 1;
		}else {
			return (num*recursiveFactorial(num-1));
		}
		
		
	}


public static void main(String[] args) {
	
	System.out.println(FactorialExample.recursiveFactorial(5));
}
}