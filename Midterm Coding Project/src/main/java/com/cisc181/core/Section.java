package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	UUID CourseID;
	UUID SemesterID;
	UUID SectionID;
	int RoomID;
	
	Section(Course x, Semester y){
		CourseID = x.CourseID;
		SemesterID = y.SemesterID;
		SectionID = UUID.randomUUID();
	}

}
