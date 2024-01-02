package introduction;

public class CarDemo {

	public static void main(String[] args) {
		//create and intialze the Object for CAr class
		
		Car cc = new Car();
		cc.setyear(1999);
		cc.getyear();
		System.out.println(cc.getSpeed());
		cc.setSpeed(100);
		System.out.println(cc.getSpeed());
		
	}

}
