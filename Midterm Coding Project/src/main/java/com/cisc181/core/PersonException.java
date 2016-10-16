package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception{
	
	Date d;
	String phone;
	
	public PersonException(Date d){
		this.d = d;
	}
	
	public PersonException(String phone){
		this.phone = phone;
	}

}
