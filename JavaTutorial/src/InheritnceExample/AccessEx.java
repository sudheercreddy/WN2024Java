package InheritnceExample;

public class AccessEx extends Cars{

	public AccessEx(int startsSpeed) {
		super(startsSpeed);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		AccessEx access= new AccessEx(10);
		System.out.println(access.protractedVariable);
		
	}

}
