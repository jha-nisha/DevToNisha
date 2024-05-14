package practice.oops.test;

public class Palindrom {
	
	public static boolean isPalindrom(String input) {
		
		if(input==null) {

        throw new IllegalArgumentException("input can't be null");
        
        		}
     StringBuilder reverse = new StringBuilder(input);	
     StringBuilder rversed = reverse.reverse();
     
		return rversed.toString().equals(input);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("palindrom :" + Palindrom.isPalindrom("tata"));
	
	}

}
