package com.app.java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class DateAndTimeConcept {
	public static void main(String[] args) {
	LocalDate ld=LocalDate.now();
	//System.out.println(ld);
	
	LocalTime lt=LocalTime.now();
	//System.out.println(lt);
	
	LocalDateTime ldt=LocalDateTime.now();
	//System.out.println(ldt);
	
	LocalDateTime ldt1 = LocalDateTime.now();
	System.out.println(ldt);
	
	DateTimeFormatter mypatten = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
	String myformat = ldt1.format(mypatten);
	System.out.println(myformat);
	
	/*
	 * DateFormatter ns=DateFormatter; SimpleDateFormat sdf =new
	 * SimpleDateFormat("dd-MM-yyyy"); ld.format(sdf)
	 */
	
	
    
	}

}
