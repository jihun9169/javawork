package overriding.shop;

public class Shop1 extends HeadShop{
	
	public Shop1() {
		System.out.println("*** 역세관 매장입니다. ***");
	}

	@Override
	public void 된장찌게() {
		System.out.println("된장찌게 : 7,500원");
	}

	@Override
	public void 김치찌게() {
		System.out.println("김치찌게 : 7,500원");
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥 : 8,000원");
	}
	
	
}
