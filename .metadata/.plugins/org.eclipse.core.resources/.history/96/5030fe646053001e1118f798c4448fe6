package customers;

//상속을 위해서 필드의 접근제어자 = protected
public class Customer {
	protected int customersId; 	// 고객 아아디
	protected String customerName;	// 고객 이름
	protected String customerGrade; // 고객 등급  
	int bonusPoint;		// 보너스 포인트
	double bonusRatio; 	// 보너스 적립율
	
	public Customer() {
		customerGrade = "SIVER";	// 기본 등급
		bonusRatio = 0.01;			// 1%
	}
	
	public Customer(int customersId,String customerName) {
		this.customersId = customersId;
		this.customerName = customerName;
		customerGrade = "SIVER";
		bonusRatio = 0.01;
	}
	
	public void setCustomerId(int customersId) {
		this.customersId = customersId;
	}
	
	public int getCustomerId() {
		return customersId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	// 보너스 포인트 = 가격 x 보너스 할인율
	public int calcPrice(int price) {
		bonusPoint = (int)(price * bonusRatio);
	return price;
	}
	
	// 정보 출력
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade +
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
