package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEG {

	public static void main(String[] args) {
		List<String> cars= new ArrayList<String>();
		cars.add("Sudheer");
		cars.add("Myra");
		cars.add("Nirvana");
		cars.add("Chittireddy");
		cars.add("Bindu");
		System.out.println("the size of ArrayList cars is "+cars.size());
		System.out.println(cars.get(0));
		System.out.println("printing for each Loop");
		for(String name: cars) {
			System.out.println(name);
		}
System.out.println("for loop======>");
for(int i =0 ;i<cars.size();i++) {
	System.out.println(cars.get(i));
	
	}
cars.remove(0);
System.out.println("the size of ArrayList after remove cars   is "+cars.size());
System.out.println("list2===>list2==>addAll");

ArrayList<String> list2= new ArrayList<String>();
//list2.addAll(cars);

for(String name1: list2) {
	if(name1.equals(name1)) {
		
	}
	System.out.println(name1);
}
}
}
