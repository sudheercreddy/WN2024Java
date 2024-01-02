package introduction;

import java.util.Scanner;

public class ReverseStringChar {
	
	public String reverseString(String text) {
		String texta = text;
		String AfterRev = "";
		
		//System.out.println(text.charAt(0));
		
		for(int i =texta.length()-1; i >=0;i--) {
			AfterRev=AfterRev+texta.charAt(i);
		}
		System.out.println("Reverse of String is "+AfterRev);
		return AfterRev;
	}
	
	public String enterKeyboardText() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Number ");
		//int input = sc.nextInt();
		//System.out.println(input);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Name  ");
		String name = sc1.nextLine();
		while(name.isEmpty()||name.isBlank()) {
			System.out.println("Enter the name, its shouls not be empty");
			 name = sc1.nextLine();
		}
		
		return name;
	}

	public static void main(String[] args) {
		ReverseStringChar char1 = new ReverseStringChar();
		
		char1.reverseString(char1.enterKeyboardText());
		//System.out.println(char1.enterKeyboardText());
		
		
		
		
		
		
		}

}
