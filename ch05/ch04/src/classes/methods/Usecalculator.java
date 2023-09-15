package classes.methods;

public class Usecalculator {

	public static void main(String[] args) {
		// 정수형 calculator 객체 생성
		Calculator calc = new Calculator();
		int num1 = 10, num2 = 2;
		
		int add = calc.add(num1, num2);
		int sub = calc.sub(num1, num2);
		int mul = calc.mul(num1, num2);
		int div = calc.div(num1, num2);
		
		System.out.println(calc);	// 객체의 메모리 주소
		
		System.out.println("두 수의 합: " + add);
		System.out.println("두 수의 차: " + sub);
		System.out.println("두 수의 곱: " + mul);
		System.out.println("두 수의 나누기: " + div);

	}


}
