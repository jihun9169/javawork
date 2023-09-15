package kkk;

import java.util.Scanner;

public class ff {

	public static void main(String[] args) {
		//customer	price	bonusRatio	bonusPoint
		// 고객의 이름, 구매 금액을 입력
		// 이름과 구매포인트 출력
		// 구매포인트(bonuspoint) = 상품가격(price) * 포인트적립율(bonusRatio)
		//System.out.println(customer + "님의 보너스 포인트는 " + bonusPoint + "점 입니다.");

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("고객의 이름을 입력하세요.");
		String customer = scanner.next();
		
		System.out.println("상품 가격을 입력하세요.");
		int price = scanner.nextInt();
		
		double bonusRatio = 0.02;
		
		int bonusPoint = (int)(price * bonusRatio);
		
		System.out.println(customer + "님의 보너스 포인트는 " + bonusPoint + "점 입니다.");
		
	}

}
