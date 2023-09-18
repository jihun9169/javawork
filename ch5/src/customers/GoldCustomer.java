package customers;

// 고객 - 골드 고객
public class GoldCustomer extends Customer{
	double saleRatio;		// 구매 할인율
	
	public void GoldCustomer() {
		customerGrade = "Gold";
		saleRatio = 0.01;
		bonusRatio = 0.02;
	}
	
	public GoldCustomer(int customersId,String customerName) {
		super(customersId, customerName);
		customerGrade = "Gold";
		saleRatio = 0.01;	
		bonusRatio = 0.02;	 
}

	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
}