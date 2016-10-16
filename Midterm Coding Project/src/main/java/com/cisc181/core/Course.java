package com.cisc181.core;

import java.util.UUID;

public class Course {
	
	UUID CourseID;
	String CourseName;
	int GradePoints;
	Enum eMajor;
	
	Course(String a){
		CourseName = a;
		CourseID = UUID.randomUUID();
	}

}
