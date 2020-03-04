package com.dateapi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		//DayAfterFifteenDay();
		//TimeforTwelve();
		//DaysToNextLeapDays();
		//ZoneTime();
		//TimeInZonal();
		 //DateFormatter();
		 NoofSundays();
	}
	//Assignment-1
	public static void DayAfterFifteenDay()
	{
		LocalDate localDate=LocalDate.now();
		LocalDate FifteenDays=localDate.plusDays(15);
		System.out.println(FifteenDays);
	}
	//Assignment-2
	public static void TimeforTwelve()
	{
		LocalDateTime localTime=LocalDateTime.now();
		LocalDateTime localTime1= LocalDateTime.of(localTime.getYear(),localTime.getMonth(),localTime.getDayOfMonth(),12, 00, 00);
		if(localTime.getHour()<12)
		{
			Duration d1 = Duration.between(localTime, localTime1);
			System.out.println(d1);
		}
		else
		{
			localTime1=localTime1.plusDays(1);
			Duration d1 = Duration.between(localTime, localTime1);
			System.out.println(d1);
		}
	}
	//Assignment-3
	public static void  DaysToNextLeapDays() {
		LocalDate localDate=LocalDate.of(2023,Month.JANUARY,25);
		LocalDate localDate1= LocalDate.of(localDate.getYear(),localDate.getMonth(),localDate.getDayOfMonth());
		if(localDate.getYear()%4==0&&localDate.getYear()%400==0&&localDate.getYear()%100!=0&&localDate.getMonthValue()<=2)
		{
			Period p=Period.between(localDate, localDate1);
			System.out.println(p);	
		}
		else if(localDate.getYear()%4==0&&localDate.getYear()%400==0&&localDate.getYear()%100!=0&&localDate.getMonthValue()>2)
		{
			localDate1=localDate1.plusYears(4);
			LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
			Period p=Period.between(localDate, localDate2);
			System.out.println(p);	
		}
		else
		{
			if(localDate.getYear()%4==1)
			{
				localDate1=localDate1.plusYears(3);
				LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
				Period p=Period.between(localDate, localDate2);
				System.out.println(p);		
			}
			else if(localDate.getYear()%4==2) {
				localDate1=localDate1.plusYears(2);
				LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
				Period p=Period.between(localDate, localDate2);
				System.out.println(p);	
			
			}
			else {
				localDate1=localDate1.plusYears(1);
				LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
				Period p=Period.between(localDate, localDate2);
				System.out.println(p);	
			
			}
		}
	}
	//Assignment-4
	public static void ZoneTime()
	{
		ZoneId romeZone= ZoneId.of("Europe/Rome");
		LocalTime localTime_2 = LocalTime.now(romeZone);
		System.out.println(localTime_2);
		ZoneId Zone2= ZoneId.of("Africa/Cairo");
		LocalTime localTime_3 = LocalTime.now(Zone2);
		System.out.println(localTime_3);

	}
	//Assignment-5
	public static void TimeInZonal()
	{
		DateTimeFormatter italianFormatter=DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
		LocalDate date3 = LocalDate.of(2014, 8, 15);
		String formattedDate_2 = date3.format(italianFormatter);
		System.out.println(formattedDate_2 );
	}
	//Assignment-6
	public static void DateFormatter()
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalDate date1 = LocalDate.of(2016, 4, 27);
		LocalTime Time = LocalTime.of(06,15,59);
		String formattedDate= date1.format(formatter);
		String formattedDate1= date1.format(formatter1);
		String formattedTime= Time.format(formatter2);
		System.out.println(formattedDate);
		System.out.println(formattedDate1);
		System.out.println(formattedTime);

	}
	//Assignment-7
	public static void NoofSundays()
	{
		int c=0;
		LocalDate localDate=LocalDate.now();
		LocalDate localDate2=LocalDate.of(localDate.getYear(),01,01);
		LocalDate localDate3=LocalDate.of(localDate.getYear(),12,31);
		for(int i=localDate2.getDayOfYear();i<localDate3.getDayOfYear();i++)
		{
			DayOfWeek dow= DayOfWeek.of(localDate2.get(ChronoField.DAY_OF_WEEK));
			System.out.println(dow);
			if(dow== DayOfWeek.SUNDAY)
			{
				c++;
			}
			//System.out.println(localDate2.getDayOf());
			localDate2=localDate2.plusDays(1);
		}
		System.out.println(c);
	}
	//Assignments-8
	
	
	
}
