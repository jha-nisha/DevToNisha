package practice.oops.test;

import java.util.HashSet;

public class TargetFinder {
	
	public static boolean findNumber(int[] array , int targetnum) {
		HashSet<Integer> processNum = new HashSet<Integer>();
		for(int i = 0;i<array.length;i++) {
			int requirednum = targetnum - array[i];
			if(processNum.contains(requirednum)) {
				System.out.println(requirednum);
				System.out.println(array[i]);
				return true;
			}else {
				processNum.add(array[i]);
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
	
		System.out.println(TargetFinder.findNumber(new int[] {20,30,60,20,50} , 40));
	}

}
