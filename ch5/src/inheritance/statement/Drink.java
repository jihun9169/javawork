package inheritance.statement;

public class Drink {
	// protected 접근제어자는 상속할때만 사용함
	protected String name;	// 상품명
	protected int price;		// 가격
	protected int count;		// 수량
	protected int alcper;		// 금액
	

	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		// 금액 = 가격 x 수량
		return price * count;
	}
	
	public static void prinTitle() {	// 제목행 출력
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	public void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t"
				+ count + "\t" + getTotalPrice());
	}
}
