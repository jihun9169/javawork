package lotto;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1~45 -> 6개 생성
		// 배열의 크기 6개인 lotto 선언
		int[] lotto = new int[6];
		
		// 6개를 동시에 생성
		for(int i = 0; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			// 중복 문제 해결 - 중첩 for
		for(int j = 0; j < i ; j++) {
			if(lotto[i] == lotto[j])
				i--;	// 이전 인덱스로 이동
		}
	}

		
		/* 7 9 3 9 20 16
		 * i = 0
		 */
		
		//6개 출력
		for(int i = 0; i < lotto.length ; i++) {
			System.out.println(lotto[i] + " ");
		}
		
		System.out.println();
		
		// 파일 이름 출력
		LottoTest lottoTest = new LottoTest();
		System.out.println(lottoTest);
	}

}
