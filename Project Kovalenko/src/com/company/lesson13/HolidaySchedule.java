package com.company.lesson13;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HolidaySchedule {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
		Calendar c = sdf.getCalendar();
		c.set(2018, 0, 1);		
		System.out.println("Новый год - " + sdf.format(c.getTime()));
		c.set(2018, 0, 7);
		System.out.println("Рождество - " + sdf.format(c.getTime()));
		c.set(2018, 2, 8);
		System.out.println("МЖД - " + sdf.format(c.getTime()));
	}
}
