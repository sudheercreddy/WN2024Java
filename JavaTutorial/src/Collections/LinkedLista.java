package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLista {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("India");
		ll.add("USA");
		ll.add("UK");
		ll.add("CANADA");
		ll.add("Australia");

		//System.out.println("the size of LinkedList ll is "+ll.size());

		for(String con :ll) {
			//System.out.println(con.toUpperCase());
		}

		ll.remove();

		//System.out.println("After remove");
		//System.out.println("the size of LinkedList ll is "+ll.size());

		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();



		runDuration(aList,"ArrayList");
		runDuration(lList,"LinkedList");
	}


	public static void runDuration(List<Integer> list, String LType) {
		System.out.println("Brgging of the duration" + LType);
		long startTime = System.currentTimeMillis();
		for(int i =0 ; i<9999999; i ++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();

		Long TotalTime= endTime - startTime;
System.out.println("Durtion of " + LType +"is "+ TotalTime );
		System.out.println(list.size());
	}
}
