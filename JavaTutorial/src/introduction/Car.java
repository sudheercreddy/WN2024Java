package introduction;

public class Car {
	
	private String make;
	private String model;
	private String colour;
	private int year;
	private int speed;
	
	public Car() {
		this.speed=60;
	}
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setyear(int year) {
		
		System.out.println("===>>****----------");
		this.year=year;
	}
	
	public void  getyear() {
		if(year<=1956) {
			System.out.println("Please enter model after 1955");
		}else {
			System.out.println(this.year);
		}
		
		
		
		}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int setSpeed(int i) {
		return	this.speed= i ;
		
	}

	
}
