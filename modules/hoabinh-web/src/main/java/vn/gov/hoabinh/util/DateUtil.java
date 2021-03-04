package vn.gov.hoabinh.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	public static final String DATE_FORMAT_FULL = "yyyyMMddHH24mmss";
	public static final String DATE_FORMAT_D_M_Y = "dd/MM/yyyy";
	public static final String DATE_FORMAT_D_M_Y_H_M_S = "dd/MM/yyyy HH:mm:ss";
	public static final String DATE_FORMAT_D_M_Y_H_M = "dd/MM/yyyy HH:mm";
	public static final String DATE_FORMAT_Y_M_D = "yyyymmdd";
	public static final String DATE_DB_FORMAT_Y_M_D = "yyyy-mm-dd";
	public static final String DATE_FORMAT_H_M_D_M_Y = "HH:mm dd/MM/yyyy";

	/**
	 * This is method parse format date to string
	 * 
	 * Version: OEP 1.1
	 * 
	 * History: DATE AUTHOR DESCRIPTION
	 * ------------------------------------------------- 26-March-2015 ThongDV
	 * Create new
	 * 
	 * @param date
	 * @param format
	 * @return string
	 */
	public static String parseDateToString(Date date, String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		} catch (Exception e) {
		}
		return "";
	}

	public static String convertDateToString(Date date, String format) {
		String vDate = "";
		try {
			if (date != null && !isNullOrEmpty(format)) {
				vDate = new SimpleDateFormat(format).format(date.getTime());
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return vDate;
	}

	public static boolean isNullOrEmpty(String inputString) {
		return (inputString == null || inputString.length() < 1);
	}

	/**
	 * This is method parse format string to date
	 * 
	 * Version: OEP 1.1
	 * 
	 * History: DATE AUTHOR DESCRIPTION
	 * ------------------------------------------------- 26-March-2015 ThongDV
	 * Create new
	 * 
	 * @param strDate
	 * @param format
	 * @return Date
	 */
	public static Date parseStringToDate(String strDate, String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.parse(strDate);
		} catch (Exception e) {
		}
		return null;
	}

	/**
	 * This is method get current date time
	 * 
	 * Version: OEP 1.1
	 * 
	 * History: DATE AUTHOR DESCRIPTION
	 * ------------------------------------------------- 26-March-2015 ThongDV
	 * Create new
	 * 
	 * @return Date
	 */
	public static Date getCurrentDateTime() {
		return new Date();
	}

	/**
	 * This is method to check validate date time input
	 * 
	 * Version: OEP 1.1
	 * 
	 * History: DATE AUTHOR DESCRIPTION
	 * ------------------------------------------------- 17-Nov-2015 DuongPT
	 * Create new
	 * 
	 * @return Date
	 */
	public static boolean isValidDate(String format, String value) {
		boolean valid = true;
		try {
			DateFormat formatter = new SimpleDateFormat(format);
			formatter.setLenient(false);
			Date date = formatter.parse(value);
		} catch (Exception e) {
			valid = false;
		}
		return valid;
	}

	public static Date getBeginOfMonth(Date date) {
		Calendar beginOfMonth = Calendar.getInstance();
		beginOfMonth.setTime(date);

		beginOfMonth.set(Calendar.DATE, 1);
		beginOfMonth.set(Calendar.HOUR_OF_DAY, 0);
		beginOfMonth.set(Calendar.MINUTE, 0);
		beginOfMonth.set(Calendar.SECOND, 0);
		beginOfMonth.set(Calendar.MILLISECOND, 0);
		return beginOfMonth.getTime();
	}

	public static int getMaxDateInMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.getActualMaximum(Calendar.DATE);
	}

	public static Date getEndOfMonth(Date date) {
		Calendar endOfMonth = Calendar.getInstance();
		endOfMonth.setTime(date);

		endOfMonth.set(Calendar.DATE, endOfMonth.getActualMaximum(Calendar.DATE));
		endOfMonth.set(Calendar.HOUR_OF_DAY, 23);
		endOfMonth.set(Calendar.MINUTE, 59);
		endOfMonth.set(Calendar.SECOND, 59);
		endOfMonth.set(Calendar.MILLISECOND, 0);
		return endOfMonth.getTime();
	}

	public static Date addYear(Date date, int yearNumber) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, yearNumber);

		return calendar.getTime();
	}

	public static String formatDate(String date, String initDateFormat, String endDateFormat) {
		try {
			Date initDate = new SimpleDateFormat(initDateFormat).parse(date);
			SimpleDateFormat formatter = new SimpleDateFormat(endDateFormat);
			return formatter.format(initDate);
		} catch (Exception e) {

		}
		return "";
	}

	public static Date getDate(String date) throws ParseException {
		SimpleDateFormat formatDate = new SimpleDateFormat(DATE_FORMAT_D_M_Y);
		return formatDate.parse(date);
	}

	public static String formatDateTime(Date date, String decs) {
		decs = "hh:mm:ss dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(decs);
		return sdf.format(date);
	}

	public static String formatDate(Date date, String decs) {
		SimpleDateFormat sdf = new SimpleDateFormat(decs);
		return sdf.format(date);
	}
	
	public static String getHours() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now)); //2016/11/16 12:08:43
		
		return sdf.format(date);
	}
	
	public static String getMinutes() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("mm");
		return sdf.format(date);
	}
}
