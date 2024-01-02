package introduction;

public class AddingMethod {
	
	
	public  static String findGrade( int score) {
	String grade;
		if(score>90 && score<=100) {
			grade = "A ****";
		}else if (score>=80 && score<90) {
			grade = "B ***";
		}else if(score>=70 && score<80) {
			grade = "C **";
		}else {
			grade = "D *";
		}
		//System.out.println("Grade is" + grade);
		return grade;
	}
	
	public static void displayGrades(String StudentName,String Grade) {
		//String gradesIs= findGrade(71);
		System.out.println("*********************");
		System.out.println(StudentName + " grade is " +Grade);
		
	}
	

	public static void main(String[] args) {
		String grade ;
		String name="sudheer";
		
		
		grade = findGrade(77);
		displayGrades(name,grade);
		grade = findGrade(99);
		displayGrades(name,grade);
		
		

	}
	
	

}
