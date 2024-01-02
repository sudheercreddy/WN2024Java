package introduction;

import InheritnceExample.Cars;

public class AcessOtherPackage extends Cars{

	public AcessOtherPackage(int startsSpeed) {
		super(startsSpeed);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcessOtherPackage acc1= new AcessOtherPackage(10);
		System.out.println(acc1.protractedVariable);

	}

}
