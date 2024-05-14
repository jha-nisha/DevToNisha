package practice.oops.test;

public class ReverseString {

	
	public static String reverse(String input) {
		String result ="";
		
		for(int i=input.length()-1;i>=0;i--) {
			result = result+input.charAt(i);
		}
		return result;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Reverse String : " + ReverseString.reverse("nisha"));
		
	}

}
