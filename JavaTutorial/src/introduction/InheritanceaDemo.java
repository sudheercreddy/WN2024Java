package introduction;

import InheritnceExample.BMW;
import InheritnceExample.Suburu;

public class InheritanceaDemo {
	
	public static void main (String[]args) {
		  BMW bw = new BMW(100);
		  bw.decreaseSpeed();
		  bw.increaseSpeed();
		  bw.rating();
		  Suburu su = new Suburu(90);
		  su.decreaseSpeed();
		  su.honk();
		  su.rating();
		  
		  
	}
}
