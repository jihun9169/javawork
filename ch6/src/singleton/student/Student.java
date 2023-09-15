package singleton.student;

public class Student {
	// 필드
	public static int studentNum = 100;	// 기준번호
	private int schoolNum;
	public Student() {
		studentNum++;
		schoolNum = studentNum;
	}
	
	//학번 출력 메서드
	public int getStudent() {
		return schoolNum;
	}

}
