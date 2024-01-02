package InheritnceExample;

public class BMW extends Cars {

	public BMW(int startsSpeed) {
		
		super(startsSpeed+20);
		
	}
	      
	
	public void increaseSpeed() {
		int speedBMW= super.speed;
		System.out.println(speedBMW+15);
	}
	
	
	public void decreaseSpeed() {
		super.speed--;
		System.out.println("Decreasing the spped of BMW Car"+super.speed);
		//System.out.println();
	}
	public void rating() {
		System.out.println(" * * * ");
	}

}
