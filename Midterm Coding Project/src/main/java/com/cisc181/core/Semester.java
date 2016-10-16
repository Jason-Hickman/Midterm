package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	
	UUID SemesterID;
	Date StartDate;
	Date EndDate;
	
	Semester(){
		SemesterID = UUID.randomUUID();
	}
	

}
