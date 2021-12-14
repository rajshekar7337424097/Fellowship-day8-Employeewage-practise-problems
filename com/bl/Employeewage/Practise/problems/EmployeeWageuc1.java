package com.bl.Employeewage.Practise.problems;

public class EmployeeWageuc1 {

	public void employeewageuc1() {
		int IS_PRESENT=1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if ( empcheck == IS_PRESENT )
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}


