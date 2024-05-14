package practice.collection.test;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> courses = new HashMap<String, Integer>();
		courses.put("Core java", 4000);
		courses.put("python", 3000);
		courses.put("Spring", 8000);
		courses.put("Android", 4000);
		courses.put("Android", 6000);
		courses.put("php", 2000);
		System.out.println("courses details : " + courses);
		
		//size
		
		System.out.println("size of hashMap : " + courses.size());
		
		/*
		 * courses.forEach((e1 ,e2)->{
		 * 
		 * System.out.println(e1 +"=>"+e2); });
		 */
		
		//traversing using java 8 for each method
		courses.forEach((key , value)->{
			
			System.out.println(key);
			System.out.println("=>");
			System.out.println(value);
			System.out.println();
		});

		//get single value of key
		System.out.println(courses.get("php"));
	}

}
