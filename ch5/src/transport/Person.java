package transport;

// 사람 클래스(자료형)
public class Person {
	// 필드
	String name;	// 이름
	int money;	//가진 돈

	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 버스를 탄다
	public void takeBus(Bus bus) {
		bus.take(1500);		// 버스 요금을 내고
		this.money -= 1500;	// 요금만큼 돈 차감
	}
	
	// 지하철을 탄다
	public void takeSubway(Subway subway) {
		subway.take(1350);		// 지하철 요금을 내고
		this.money -= 1350;	// 요금만큼 돈 차감
	}
	// 사람 정보
	public void showPersonInfor() {
		System.out.printf("%s님의 남은 돈은 %,d원 입니다.\n",
				name,money);
	}
}
