package student;

public class StudentTest {

	public static void main(String[] args) {
		Student[] s1 = new Student[3];
		
		s1[0] = new Student("서지훈", 25, 100);
		s1[1] = new Student("정태우", 25, 90);
		s1[2] = new Student("조민재", 25, 80);
		
		System.out.println(s1[0].toString());
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			System.out.println(s1[i].toString());
		}

	}

}
