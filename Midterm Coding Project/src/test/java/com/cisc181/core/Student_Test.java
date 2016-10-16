package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException{
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course("Math"));
		courseList.add(new Course("Chemistry"));
		courseList.add(new Course("Spanish"));
		
		ArrayList<Semester> semesterList = new ArrayList<Semester>();
		semesterList.add(new Semester());
		semesterList.add(new Semester());
		
		ArrayList<Section> sectionList = new ArrayList<Section>();
		for(Course x : courseList){
			for(Semester y: semesterList){
				sectionList.add(new Section(x,y));
			}
		}
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("A","A","A",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("B","B","B",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("C","C","C",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("D","D","D",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("E","E","E",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("F","F","F",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("G","G","G",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("H","H","H",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("I","I","I",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
		studentList.add(new Student("J","J","J",new Date(1990,1,1),eMajor.CHEM,"Address","(111)111-1111","aaa@fake.edu"));
	}

	@Test
	public void test1() {
		ArrayList<Double> courseAverages = new ArrayList<Double>();
		for(Course c : courseList){
			ArrayList<Double> gradeList = new ArrayList<Double>();
			for(Student x : studentList){
				for(Section y: sectionList){
					Enrollment a = new Enrollment(y.SectionID,x.getStudentID());
					a.SetGrade(100.00);
					gradeList.add(a.Grade);
				}
			}
			double average = 0;
			for(double g : gradeList){
				average += g;
			}
			average /= gradeList.size();
			courseAverages.add(average);
		}
		ArrayList<Double> testList = new ArrayList<Double>();
		testList.add(100.00);
		testList.add(100.00);
		testList.add(100.00);
		assertEquals(courseAverages, testList);
	}
	
	@Test
	public void test2(){
		studentList[0].setMajor(eMajor.BUSINESS);
		assertEquals(studentList[0].getMajor(),eMajor.BUSINESS);
	}
}