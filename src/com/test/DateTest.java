package com.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		
		String dateStr = "Thu Oct 20 16:48:24 IST 2016";
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date date = (Date)formatter.parse(dateStr);
		System.out.println(date);        

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String formatedDate = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR);
		System.out.println("formatedDate : " + formatedDate);
		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		String result = df.format(cal.getTime());
		System.out.println("fmt: " + result);

	}

}
