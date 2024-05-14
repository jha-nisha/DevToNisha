package practice.collection.test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class TraverseExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("nisha");
		arrayList.add("sid");
		arrayList.add("shiwani");
		arrayList.add("rahul");
		
		//Traversing using forEach loop
		
		for(String str : arrayList) {
			System.out.println(str + "\t" + str.length()+"\t");
			
			//reverse string using stringBuffer
			
			StringBuffer strBuffer = new StringBuffer(str);
			System.out.println("reverse string:" + strBuffer.reverse());
		}
		
	     System.out.println("------------------------------------------");
		
	     //Iterator can be used to traverse over HashMap, LinkedList, ArrayList, HashSet, TreeMap, and TreeSet .
	     //Traversing using iterator forward traversing
		
	     Iterator<String> itr = arrayList.iterator();
	     //this method will true until it will provide elements 
	     while(itr.hasNext()) {
	    	 
	    	String next = itr.next();
	    	System.out.println("forward traversing : " + next);
	     }
	     
	     System.out.println("------------------------------------------");
	   //Traversing using iterator backward Listtraversing
	     ListIterator<String> listItr = arrayList.listIterator(arrayList.size());
	     while(listItr.hasPrevious()) {
	    	 String prv = listItr.previous();
	    	 
	    	 System.out.println("backward direction : " + prv);
	     }
	     
	     System.out.println("------------------------------------------");
	     //enumration
	     //enumuration will be used only legacy classed VECTOR and hashTable
	      
	     Vector<String> vector = new Vector<String>();
		vector.addAll(arrayList);
		
		Enumeration enumrtr = vector.elements();
		while(enumrtr.hasMoreElements()) {
			
			Object enumValue = enumrtr.nextElement();
			System.out.println("traverse through enumuration : " + enumValue);
			
		}
		//forEach method for java 8
		arrayList.forEach(e->{
			
			System.out.println("java 8 for each method for traversing :" + e);
		});
	   //treeset 
		System.out.println("sortingof elements : ");
		TreeSet<String > treeSet = new TreeSet<String>();
		treeSet.add("Yadav");
		treeSet.add("mishra");
		treeSet.add("nisha");
		treeSet.add("ABC");
		treeSet.forEach(str->{
			
			System.out.println(str);
		});
	}
	

}
