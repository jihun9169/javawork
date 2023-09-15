package user;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User("아아아", 123, "서지훈");
		User user2 = new User("라라라", 123, "조민재");
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());

	}

}
