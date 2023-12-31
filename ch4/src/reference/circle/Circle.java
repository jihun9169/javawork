package reference.circle;

public class Circle {
	Point center;	// Point center = null
	int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point(x,y);	// center 객체 생성
		this.radius = radius;
	}
	
	public void showPointInfo() {
		System.out.println("원의 중심은 (" + center.x + ", " + center.y +
				")이고, 반지름은 " + radius + "입니다");
	}
}
