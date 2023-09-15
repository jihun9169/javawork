package mart;

public class Customer {
	// 고객이름, 고객 등급, 고객 아이디, 고객 주소, 보너스 포인트, 보너스 적립율  
	
	protected String customerName;			// 고객 이름
	protected String customerGrade;			// 고객 등급
	protected String customerId;			// 고객 아이디
	protected String customerAddress;		// 고객 주소
	protected int bonusPoint;				// 보너스 포인트
	protected double Ratio;			// 보너스 적립율
	
	public Customer() {
		customerGrade = "basic";
		Ratio = 0.01;
	}
	public int calcPrice(int price) {
		bonusPoint += price * Ratio;
		return price;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	
	public String showCustomerInfo() {
		return "고객의 이름은" +  customerName + "이며 아이디는 " + customerId + "이고 등급은"
		+customerGrade+ "이고 주소는" + customerAddress + "이고 적립 포인트는 "
		+ bonusPoint+ "입니다.";
	}
	
	

}
