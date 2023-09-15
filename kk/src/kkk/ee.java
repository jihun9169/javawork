package kkk;

import java.util.Scanner;

public class ee {
public static void main(String[] args) {
	

	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력하세요.");
	String name = scanner.nextLine();
	
	System.out.println("나이를 입력하세요.");
	int age = scanner.nextInt();
	
	System.out.println("당신의 이름은" + name + "이군요.");
	System.out.println("당신의 나이는" + age + "이군요.");
	
	
	}
}
