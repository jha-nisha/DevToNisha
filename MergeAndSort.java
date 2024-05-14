package practice.oops.test;

import java.util.Arrays;

public class MergeAndSort {
	
	private static int[] mergeSortArray(int[] arrayA ,int[] arrayB ) {
		
		int[] mergedArray = new int[arrayA.length + arrayB.length];
		
		int i = 0 , j = 0 , k = 0;
		
		while(i<arrayA.length) {
			
			mergedArray[k] = arrayA[i];
			
			i++;
			k++;
		}
		while(j<arrayB.length) {
			mergedArray[k] = arrayB[j];
			
			j++;
			k++;
		}
		
		Arrays.sort(mergedArray);
		
		return mergedArray;
		
		
	}

	public static void main(String[] args) {
		
		int[] arrayA = new int[] {0,-1 ,-2,5,8,9};
		int[] arrayB = new int[] {-7 ,-3,1,2,3,4};
		int[] mergedArray = mergeSortArray(arrayA, arrayB);
		
		System.out.println("ArrayA : "+Arrays.toString(arrayA));
		System.out.println("ArrayB : "+Arrays.toString(arrayB));
		System.out.println("MergedArray : "+Arrays.toString(mergedArray));

	}

}
