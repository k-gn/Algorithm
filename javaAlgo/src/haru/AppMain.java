package haru;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AppMain {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 07, 31);
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekOfMonth = date.get(weekFields.weekOfMonth());
		System.out.println(date.getYear() + "-" + date.getMonthValue() + "-" + weekOfMonth);
	}
}
