package ch07;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 100);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("영어", 100);
		studentKim.addSubject("수학", 100);
		
		studentLee.showStudentInfo( );
		System.out.println("===============");
		studentKim.showStudentInfo( );
		
	}

}
