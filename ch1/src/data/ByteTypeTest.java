package data;

public class ByteTypeTest {

	public static void main(String[] args) {
		// byte 관련 자료형
		// 정수 자료형 - byte, short, int, long
		// byte의 범위 : -128 ~ 127
		// short의 범위 : -32768 ~ 32767
		byte bData1 = -128;
		System.out.println(bData1);
		
		//bData2 = 128;	// 범위를 초과
		//System.out.println(bData2);
		short sData1 = 128;
		System.out.println(sData1);
		
		//10진수, 2진수, 16진수 출력
		// 객체의 이름과 주소
		ByteTypeTest test = new ByteTypeTest();
		//System.out.println(test);
		
		int num = 10;	// 10진수
		int bNum = 0b1010;	// 2진수를 표기할 떄 접두어로 0b를 붙임
		int hNum = 0xA;	// 16진수를 표기할 때 접두어로 0x를 붙임
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(hNum);
		System.out.println("============================");
		
		// 10진수 5를 2진수로 표기 - 32bit
		// 10진수 -5를 2진수로 표기
		// 1. 보수로 만듬 2. 1을 더함
		int val1 = 0b00000000000000000000000000000101;	// 5
		int val2 = 0b11111111111111111111111111111011;	// -5
		System.out.println(val1);
		System.out.println(val2);
	}

}
