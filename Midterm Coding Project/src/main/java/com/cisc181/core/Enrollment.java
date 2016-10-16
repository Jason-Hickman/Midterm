package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment(){
		EnrollmentID = UUID.randomUUID();
	}
	
	Enrollment(UUID Section, UUID Student){
		
		EnrollmentID = UUID.randomUUID();
		StudentID = Student;
		SectionID = Section;
		
	}
	
	void SetGrade(double grade){
		Grade = grade;
	}

}
