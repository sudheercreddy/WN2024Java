package introduction;

public class SwitchEg {

	public static void main(String[] args) {
	
		String browser= "ChroMe";
		
		switch(browser) {
		
		case  "firefox" :
			System.out.println("firefox driver");
			break;
		case  "chrome" :
			System.out.println("firefox driver");
			break;
		case  "SAfari" :
			System.out.println("firefox driver");
			break;
			default:
			System.out.println("not the compatable browser");
			}
		
		
		if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("firefox driver");
		}else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome");
		}else if(browser.equalsIgnoreCase("Safari")) {
			System.out.println("Safari");
			
		}else {
			System.out.println("Edge browser");
		}
		
		
		//The for loop is used when the number of iterations is known
		
		String[] brows= {"chrome","edge","firefox"};		
		for(String i : brows) {
			System.out.println("the browser avalable are : "+ i.toUpperCase());
		}
		System.out.println("For loop ");
		for(int i =0 ; i<brows.length;i++) {
			System.out.println("the browser avalable are : "+ brows[i].toUpperCase());
		}
		
		//while loop
		//The while loop is used when the number of iterations is unknown
		System.out.println("While loop");
		
		int j =0;
		while(j<brows.length) {
			System.out.println("the browser avalable are : "+ brows[j].toUpperCase());
			j++;
		}
		
	}

}
