package introduction;

public class StringExec {

	public static void main(String[] args) {
		String reversedTest = reverse("this is a test string");
		//reverse("Hello world how are you ");
		if (reversedTest.equalsIgnoreCase("string test a is this ")) {
			System.out.println(" ");
			System.out.println("match the strings");
		}else {
			System.out.println("unmatched strings");
		}
		
	}
	public static String  reverse(String text) {
		String msg = text;
		
		String[] aa= msg.split(" ");
		//System.out.println(aa.length);
		String forText= "";
		for(int i=aa.length-1;i>=0;i--) {
			System.out.print(aa[i]+ " ");
			forText=forText+aa[i]+" ";
			
		}
	return forText;
	}
	
	

}
