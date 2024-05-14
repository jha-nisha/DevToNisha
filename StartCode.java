package practice.collection.test;
import java.util.*;
public class StartCode {

	public static void main(String[] s) {
		
		System.out.println("welcome to collection ");
		
		//type safe collection : used generics 
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("nisha");
		arrayList.add("sid");
		arrayList.add("shiwani");
		arrayList.add("rahul");
		
		  System.out.println("list of name : " + arrayList);
		 
		//get element
		  System.out.println("get first element of lis : " + arrayList.get(0));
		  System.out.println("get last element of lis : " + arrayList.get(3));
		 
		
		//untype safe collection : non generics as we can use all types of data
		
		
		  LinkedList linkedList = new LinkedList();
		  
		  linkedList.add(123); linkedList.add("nisha"); linkedList.add(0.56744);
		  linkedList.add(true);
		  
		  System.out.println("list of nongenerics value : " + linkedList);
		 
		//remove element
		
		  arrayList.remove(1); System.out.println("removed 1st element of list : " +
		  arrayList);
		 
		//size of list
		System.out.println("size : " + arrayList.size());
		
		//item is there or not
		System.out.println("itme is there or not ; " + arrayList.contains("nisha"));
		System.out.println("itme is there or not ; " + arrayList.contains("nisha kumari"));
	
	    //check empty or not
		
		System.out.println("collection is empty or not: "+ arrayList.isEmpty());
		
		//setting value and replace
		
		System.out.println("replace the value ; " + arrayList.set(0, "nisha jha"));
	  //add new element without replace
		arrayList.add(1, "siddarth");
		System.out.println("adding new value without replace : " + arrayList );
	
		//remove all elements
		//arrayList.clear();
		
		//typesafe vector
		Vector<String> vector = new Vector<String>();
		vector.addAll(arrayList);
		System.out.println("adding all arraylist vaue in vector ; " + vector);
		
		System.out.println("-------------------------------------------------------");
		
		HashSet<Double> hashSet = new HashSet<Double>();
		hashSet.add(14.4);
		hashSet.add(14.4);
		hashSet.add(14.114);
		hashSet.add(14.5);
		hashSet.add(20.4);
		hashSet.add(18.4);
		System.out.println("hashset value : " + hashSet);
		System.out.println("----------------------------------------------------");
		
		TreeSet<Double> treeSet = new TreeSet<Double>();
		treeSet.add(11.45);
		treeSet.add(12.45);
		treeSet.add(09.45);
		//print sorted value
		System.out.println("Treeset value : " + treeSet);
	}
}
