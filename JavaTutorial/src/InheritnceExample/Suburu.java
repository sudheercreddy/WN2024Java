package InheritnceExample;

public class Suburu extends Cars{
	

	public Suburu(int startSpeed) {
		
		super(startSpeed+10);
		
	}
	
	@Override
	public void increaseSpeed() {
		super.speed++;
		System.out.println("Speed increased to " + super.speed);
	}
	
	@Override
	public void decreaseSpeed() {
		super.speed--;
		System.out.println("Speed decrease to " + super.speed);
	}
	
	public void rating() {
		System.out.println(" * * * *");
	}

}
