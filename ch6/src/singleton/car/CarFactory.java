package singleton.car;

public class CarFactory {
	private static CarFactory instance;
	
	private CarFactory() {}
	
	// instance 생성 메서드 정의
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	// 자동차 메서드
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
