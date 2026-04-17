public class Grade {

	static char getGrade(double marks){

		if (marks >= 90) return 'A';
		else if (marks >= 80) return 'B';
		else if (marks >= 70) return 'C';
		else if(marks >= 60) return 'D';
		else return 'F';
	}

	public static void main(String[] args){
		double marks = 85;

		System.out.println("Marks : " + marks);
		System.out.println("Final grade :" + getGrade(marks));
	}
}