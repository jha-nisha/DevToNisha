package practice.oops.test;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num =0 , num1 =1, fib;
		
		System.out.println(num+""+num1);
		
		int count = 15;
		for(int i = 0;i<count;i++) {
			fib=num+num1;
			System.out.println(" "+fib);
			num=num1;
			num1 = fib;
		}
	}

}
