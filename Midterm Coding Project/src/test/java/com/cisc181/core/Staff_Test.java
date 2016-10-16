package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup(){
	
	}
	
	@Test
	public void test1() throws PersonException{
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		//Staff(String FirstName, String MiddleName, String LastName,
		//Date DOB, String Address, String Phone_number, String Email,
		//String officeHours, int rank, double salary, Date hireDate,
		//eTitle Title)
		staffList.add(new Staff("A","A","A",new Date(1950,1,1),"Fake Adress","(111)111-1111","AAA@fake.edu","Mon 2-3",1,50000.00,new Date(2000,1,1),eTitle.MR));
		staffList.add(new Staff("B","B","B",new Date(1955,1,1),"Fake Adress","(111)111-1111","AAA@fake.edu","Mon 2-3",1,75000.00,new Date(2000,1,1),eTitle.MR));
		staffList.add(new Staff("C","C","C",new Date(1960,1,1),"Fake Adress","(111)111-1111","AAA@fake.edu","Mon 2-3",1,80000.00,new Date(2000,1,1),eTitle.MR));
		staffList.add(new Staff("D","D","D",new Date(1965,1,1),"Fake Adress","(111)111-1111","AAA@fake.edu","Mon 2-3",1,45000.00,new Date(2000,1,1),eTitle.MR));
		staffList.add(new Staff("E","E","E",new Date(1970,1,1),"Fake Adress","(111)111-1111","AAA@fake.edu","Mon 2-3",1,90000.00,new Date(2000,1,1),eTitle.MR));

		double AverageSalary = 0;
		for(Staff x : staffList){
			AverageSalary += x.getSalary();
		}
		AverageSalary /= staffList.size();
		assertEquals(AverageSalary,68000.00);
	}	
	
	@Test
	public void test2() throws PersonException{
		boolean DOBException = false;
		try{
			new Staff("A","A","A",new Date(1900,1,1),"Fake Adress","(111)111-1111","AAA@fake.edu","Mon 2-3",1,50000.00,new Date(2000,1,1),eTitle.MR);
		}
		catch (PersonException x){
			DOBException = true;
		}
		assertTrue(DOBException);
	}
	
	@Test
	public void test3() throws PersonException{
		boolean phoneException = false;
		try{
			new Staff("A","A","A",new Date(1950,1,1),"Fake Adress","NOTAPHONENUMBER","AAA@fake.edu","Mon 2-3",1,50000.00,new Date(2000,1,1),eTitle.MR);
		}
		catch(PersonException x){
			phoneException = true;
		}
		assertTrue(phoneException);
	}

}
