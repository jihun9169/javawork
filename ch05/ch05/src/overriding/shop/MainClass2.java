package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		// 부모형으로 객체 생성 - 자동 형변환
		HeadShop shop1 = new Shop1();
		shop1.비빔밥();
		
		System.out.println("============");
		
		HeadShop shop2 = new Shop2();
		shop2.비빔밥();

		int iNum = 10;
		double dNum;
		dNum = iNum;
		System.out.println(dNum);	// 10.0
		
		iNum = (int)dNum;
		System.out.println(iNum);	// 10
	}

}
