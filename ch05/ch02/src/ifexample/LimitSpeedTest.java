package ifexample;

public class LimitSpeedTest {

	public static void main(String[] args) {
		// if문
		// 제한 속도(limit speed) 50이면 "제한 속도 위반"
		/* 
		  if(비교){	//비교문이 true이면 실행문이 작동함
		  	실행문1;
		  }else{ //false이면 실행문2 작동
		  	실행문2;
		 */
		int limitSpeed = 45;
		
		/* 단독 if 문
		 if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반!");
		}*/
		
		// if ~ else 구문
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반!");
		}else {
			System.out.println("안전 속도 준수!");
		}
		System.out.println("시속" + limitSpeed + "km입니다.");
	}

}
