package javaExample;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class java558_ {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		System.out.println(zid);
		ZonedDateTime zdt = dateTime.atZone(zid);
		
		System.out.println(zdt);
		
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(nyTime);
		String[] str = {"1번","2번","3번"};
		
		
		
	}
}
