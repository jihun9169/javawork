package whileexample;

public class WhileIfBreak {

	public static void main(String[] args) {
		// 반복조건문(while ~ if ~ brack
		// 1부터 10까지
		
		int i = 0;
		
		while(true) {	// 무한반복
			i++;
			System.out.println(i);
			if(i == 10) // 중괄호 블럭은 실행문이 한 줄일때 생량 가능
				break;	// 탈출
			
		}

	}

}
