package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		// 크기가 5인 실수형 배열 data 선언
		// 총점 - total
		// 평균 변수 = average
		double[] data = new double[5];
		int total = 0;
		double average = 0;
		
		// 저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		// 전체 조회
		for(int i = 0; i < data.length; i++) {
			total += data[i];
			// 평균 계산
			average = total / data.length;
			System.out.println(data[i]);
		}
		
		// 총점 출력
		System.out.println("총점 : " + total);
		// 평균 출력
		System.out.println("평균 : " + average);
		
		
	}

}
