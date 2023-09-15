package data;

public class TypeConversionTest {

	public static void main(String[] args) {
		// 1. 자동 형변환
		int iNum = 20;
		float fNum = iNum;	// 실수형 = 정수형
		
		System.out.println(iNum);	// 20
		System.out.println(fNum);	// 20.0
		
		double dNum;	// 실수형 8byte
		dNum = iNum + fNum;	// 자동 형변환(묵시적 형변환)
		System.out.println(dNum);
		
		// 2. 강제 형변환(cast)
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum2 = (int)dNum1 + (int)fNum2;	// 강제 형변환
		System.out.println(iNum2);
		
		int iNum3 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);	// (int)2.1 = 2
		
	}

}
