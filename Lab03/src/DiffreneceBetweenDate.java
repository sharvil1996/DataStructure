import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DiffreneceBetweenDate {

	public static long betweenDates(String date1, String date2) throws IOException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate firstDate = LocalDate.parse(date1, formatter);
		LocalDate secondDate = LocalDate.parse(date2, formatter);
		long days = ChronoUnit.DAYS.between(firstDate, secondDate);
		return Math.abs(days);
	}

}
