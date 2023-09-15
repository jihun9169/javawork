package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("우영우", 20000);
		// 버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus52 = new Bus(52);
		
		// 지하철 객체 생성
		Subway green = new Subway("2호선");
		
		p1.takeBus(bus100);
		p2.takeBus(bus52);
		p1.takeSubway(green);
		
		p1.showPersonInfor();
		p2.showPersonInfor();
		
		bus100.showBusInfo();
		bus52.showBusInfo();
		green.showSubwayInfo();

	}

}
