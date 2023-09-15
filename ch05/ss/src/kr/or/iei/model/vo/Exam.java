package kr.or.iei.model.vo;

public class Exam {
	/*예상결과

아이디 비밀번호 이름 나이 전화번호

user01 pass01 유저1 23 01011112222

user02 pass02 유저2 27 01022223333

user03 pass03 유저3 34 01033334444*/
	
	public void exam1() {
	
		User[] users = new User[3];
		User user1 = new User("user01",01, "유저1", 23, 2222222);
		User user2 = new User("user02",02, "유저2", 27, 3333333);
		User user3 = new User("user03",03, "유저3", 24, 4444444);
	
	
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
	
		
		

		
		
	
		

		System.out.println("아이디\t비밀번호\t이름\t나이\t전화번호");
		for(int i = 0; i < users.length; i++) {
			
			System.out.println(users[i].toString());
		}
		
}

		
}
