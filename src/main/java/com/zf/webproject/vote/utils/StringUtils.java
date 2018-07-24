package com.zf.webproject.vote.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {

	private static boolean isNull(String value) {
		return value == null;
	}

	public static boolean isNullOrEmpty(String value) {
		if (StringUtils.isNull(value)) {
			return true;
		}
		return value.length() == 0;
	}

	public static String nullToString(String value) {
		return nullToString(value, "");
	}

	public static String nullToString(String value, String defaultValue) {
		if (StringUtils.isNull(value)) {
			return defaultValue;
		}
		return value;
	}

	public static String formatDate(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static Date parseDate(String dateStr, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static String formatDate(String dateStr, String formatIn, String formatOut) {
		return formatDate(parseDate(dateStr, formatIn), formatOut);
	}
}
