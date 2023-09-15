package singleton.student;

public class School {
	// 필드
	private static School instance;
	
	private School(){}
	
	//instance 생성 메서드 정의
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
			}
		return instance;
	}
	
	//학생 메서드
	public Student inStudent() {
		Student student = new Student();
		return student;
	}
}
