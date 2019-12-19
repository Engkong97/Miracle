package com.mantabs.collection.master.area_assignment.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelperBase {
	
	public static String dateFormat(Date date) {
		String pattern = "dd MMMM yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String stringDate = simpleDateFormat.format(date);
		return stringDate;
	}
}
