package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// LocalDateTime 클래스 사용
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜 / 시간 포멧 설정 - "yyyy/MM/dd hh:mm:ss a"
		DateTimeFormatter timeFormat = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
		
		System.out.println(now.format(timeFormat));
		
		// 날짜 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 시간 설정
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// 시간 포멧 설정 - "HH:mm:ss a"
		DateTimeFormatter timeForma = 
				DateTimeFormatter.ofPattern("HH:mm:ss a");
		
		System.out.println(now.format(timeFormat));
		
		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);
		LocalDate today = LocalDate.of(2023, 9, 15);
		
		
		// 지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(startDay, today);
		System.out.println(passedTime + "일이 지났습니다.");
	}

}
