package introduction;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int[] myIntArray1 = new int[10];
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		myIntArray1[2] = 200;
		myIntArray1[3] = 99;
		
		
		
		System.out.println("foreach start");
		for (int i : myIntArray1) {
			if(i!=0) {
				System.out.println(i);
			}
			
	
		}
		
		System.out.println("foreach END");
		//After sorting
		Arrays.sort(myIntArray1);
		System.out.println("Sorting into ascending order");
		
		for(int j=0 ;j<=myIntArray1.length-1;j++) {
			if(j!=0) {
				System.out.println("index of " +j + " - "  +myIntArray1[j]);
			}
			
		
		}
			
		System.out.println("Sorting into Decending order");
		
		for(int k=myIntArray1.length-1 ;k>0;k--) {
			if(k!=0) {
				System.out.println("index of " +k + " - "  +myIntArray1[k]);
			}
		 



	}
		System.out.println(myIntArray1.length);

		//second way of creating array
		String[] cars = {"bmw","suburu","honda","toyato"};

		Arrays.sort(cars);
		System.out.println(cars.length);

		for(String cr : cars) {
			System.out.println(cr);
		}

	}}
