import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


public class DateTimeOne extends MesoDateTimeOneAbstract
{
	
	//returns the value of the second in the minute
	public int getValueOfSecond() {
		LocalDateTime dateTime = LocalDateTime.now();
		int secondValue = dateTime.getSecond();
		return secondValue;
	}
	
	// prints the current value of the second and the date and time.
	public void dateTimeNow() {
		
		LocalDateTime now = LocalDateTime.now();
		//"Current Date/Time: 10/08/2019 03:03 PM"
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm a");
		String formatDateTime = now.format(formatter);
		
		System.out.println("The value of Second now: " + getValueOfSecond());
		System.out.println("Current Date/Time: " + formatDateTime);
	}
	
	//if value of second is more than 55, sleep for 5 seconds
	public void sleepForFiveSec() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	//prints server time and other cities times
	public void dateTimeOfOtherCity() { 
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
		String formatDateTime = now.format(formatter);
		//prints the time of the server
		System.out.println("Time on server: " + formatDateTime);
		
		//prints GMT time zone
		ZoneId zone0 = ZoneId.of("GMT");
		LocalDateTime GMT = LocalDateTime.now(zone0);
		String timeGMT = GMT.format(formatter);
		System.out.println("GMT: " + timeGMT);
		 
		//prints time in BST
		ZoneId zone1 = ZoneId.of("GMT");
		LocalDateTime BSTtz = LocalDateTime.now(zone1);
		LocalDateTime BST = BSTtz.plusHours(6);
		String timeBST = BST.format(formatter);
		System.out.println("BST (90E): " + timeBST);

		//prints time in CST
		LocalDateTime CST = BST.minusHours(11);
		String timeCST = CST.format(formatter);
		System.out.println("CST (90W): " + timeCST);

	}
	
	public void dateTimeDifferentZone() {
		
	}
	
	public void timeZoneHashMap() {
		
	}

	
}