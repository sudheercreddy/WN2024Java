package introduction;

public class StaticDemo {
	
	public static void main(String[] args) {
		addNumStatic();

	}
	static int addNum = 10;
	static int  addNumStatic = 20;
	
	
	public void addNumNon() {
		System.out.println(addNum);
		System.out.println(addNumStatic);
	}
	
	
	public static void addNumStatic() {
		System.out.println(addNum);
		System.out.println(addNumStatic);
	}

}
