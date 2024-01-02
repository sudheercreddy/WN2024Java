package introduction;

import java.util.Iterator;

public class Strings {
	//string literals- string constant pool,create one object and referenving to str and str2
	static String str = "hello";
	static String str2 = "hello";
	//str is the reference variable and hello is the object.
	
	
	
	//string objects -Heap . create below  2 objects and it reference with str3 and str4
	String str3 = new String("Hello world");
	String str4 = new String("Hello world");
	public static void main (String[]args) {
		
		String name = "this is the test string";
		System.out.println(name.length());
		
		System.out.println(name.charAt(3));
		
		System.out.println(name.contains("test"));
		
		System.out.println(name.startsWith("this"));
		System.out.println(name.endsWith("string"));
		System.out.println(str.equals(str2));
		System.out.println(name.indexOf('t'));
		System.out.println(name.indexOf("ing"));
		
		//Converts this string to a new character array.
		
		char[] nameof = name.toCharArray();
		//System.out.println(nameof.length);
		System.out.println("REVERSE Of nameof--using legth-1");
		for(int i=nameof.length-1; i>=0; i--) {
			System.out.print(nameof[i]);
			
		}
		System.out.println("");
		System.out.println("REVERSE of string using chatAt()");
		
		name = "this is the test string";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.toUpperCase().charAt(i));
			
		}
		System.out.println("");
		System.out.println("using reverse method");
		
		
		/*for (char c : nameof) {
			System.out.print(c);
			System.out.println(" ");
		}
		*/
		
		String aplha = "hello world";
		//System.out.println(aplha.trim());
		
		System.out.println(aplha.substring(0,5));
		System.out.println(aplha.toUpperCase().replace("HELLO", "Suvks"));
	}
}
