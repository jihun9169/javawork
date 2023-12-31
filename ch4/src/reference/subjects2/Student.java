package reference.subjects2;

import reference.subjects.Subject;

public class Student {
	private int studentId;
	private String studentName;
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];	// 과목을 저장할 배열의 크기 10개 생성
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		//과목 객체를 생성해서 값(과목 이름, 점수)를 저장
		Subject subject = new Subject(name, score);
		//subject.setSudjectName(name);
		//subject.setScorePoint(score);
		
		// 과목을 배열에 저장
		//subjects[0] = subject;	// 1개 저장
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) {	// 배열의 요소가 비어있을때
			subjects[i] = subject;	// 배열 객체를 저장
			break;
			}
		}
	}
	// 학생 정보 출력
	public void showStudentInfo() {
		int total = 0;	// 총점
		double average;	// 평균
		int count = 0;	// 과목 수 
		
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] != null) {	// 배열의 요소 차 있을때(비어있지 않을때)
			//Subject subject = subjects[i];	// 객체를 생성하고 출력
			total += subjects[i].getScorePoint();
			//count++;
			
			System.out.println(studentId + "번 학생 " + studentName +"의 " 
			+ subjects[i].getSubjectName() + " 점수는 " +
					subjects[i].getScorePoint() + "점 입니다.");
		}
	}
		average = (double)total / count;
	System.out.printf("과목의 총점은 %d점이고, 평균은 %.1f입니다\n", total,average);
}
}
