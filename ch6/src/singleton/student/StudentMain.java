package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		School school = School.getInstance();
		
		Student kim = school.inStudent();
		Student seo = school.inStudent();
		Student lee = school.inStudent();
		
		System.out.println("학번: " + kim.getStudent());
		System.out.println("학번: " + seo.getStudent());
		System.out.println("학번: " + lee.getStudent());
		
		

	}

}
