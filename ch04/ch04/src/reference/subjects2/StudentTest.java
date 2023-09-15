package reference.subjects2;

public class StudentTest {

	public static void main(String[] args) {
		// 사람
		Student kim = new Student(101, "김대한");
		Student Park = new Student(102, "김대호");
				
		// 과목 추가
		kim.addSubject("국어", 90);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 80);
		Park.addSubject("국어", 70);
		Park.addSubject("수학", 65);
		Park.addSubject("영어", 60);
		
		// 출력
		kim.showStudentInfo();	
		Park.showStudentInfo();	

	}

}
