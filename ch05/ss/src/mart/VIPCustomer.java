package mart;

public class VIPCustomer extends Customer{
	// 고객이름, 고객 등급, 고객 아이디, 고객 주소, 보너스 포인트, 보너스 적립율, 상담원, 할인율

	private String people;
	double sale;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		sale = 0.1;
		Ratio = 0.05;
	}	
	public int calcPrice(int price) {
		bonusPoint += price * Ratio;
		return price - (int)(price*sale);
		}
	public String getPeople() {
		return people;
	}
	public String showPeopleInfo() {
		return customerName + "님의 아이디는" + customerId+ "이고 등급은" +
	customerGrade + "이며 주소는" + customerAddress +"이고 상담원은" +
				people + "입니다";
	}
	
	
	
	
	

	
	
}
