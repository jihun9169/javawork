package kkk.student;

public class Student {
	//이름 학년 반
	private String name;
	private int age;
	private int xx;
	
	public Student(String name, int age, int xx) {
		this.name = name;
		this.age = age;
		this.xx = xx;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setXx(int xx) {
		this.xx = xx;
	}
	public int getXx() {
		return xx;
	}
	
	
	

}
