package stringprac;

import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {

		
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.getTime());
		System.out.println(c.getCalendarType());
		System.out.println(c.getWeekYear());
		System.out.format("%tB %te, %tY%n", c, c, c);
		
		
		
	}

}
