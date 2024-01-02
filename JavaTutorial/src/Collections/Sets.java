package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	
	
	/*
	 * SET-->A collection that contains no duplicate elements.  and at most one null element.
	 * 
	 */

	public static void main(String[] args) {
		/*
		 * HashSet --> doen't not maintain Order,faster
		 */
		Set<String>ss = new HashSet<String>();
		ss.add("Zebra");
		ss.add("York");
		ss.add("Welcome");
		ss.add("Apple");
		ss.add(null);
		ss.add("Boy");
		
		System.out.println("HashSet-->" + ss);
		
		/*
		 * LinkedHashSet -->  maintain insertion  Order
		 */
		Set<String> lhSet =  new LinkedHashSet<String>();
		lhSet.add("Zebra");
		lhSet.add("York");
		lhSet.add("Welcome");
		lhSet.add("Apple");
		lhSet.add(null);
		lhSet.add("Boy");
		
		
		System.out.println("LinkedHashSet-->" + lhSet);
		
		
		
		/*
		 * TreeSet -->  sorted according to the natural ordering of its elements
		 *  ,for ex: ig strings in alphabetical order or 1,2,3,4
		 */
		Set<String> tSet =  new TreeSet<String>();
		tSet.add("Zebra");
		tSet.add("York");
		tSet.add("Welcome");
		tSet.add("Apple");
		//tSet.add(null);
		tSet.add("Boy");
		
		System.out.println("LinkedHashSet-->" + tSet);

	}

}
