package com.bl.Employeewageuc3.Practise.problems;

public class EmployeeWageUC3 {
	public static void employeeWageCalculation() {
		int IS_PRESENT = 1;
		int IS_PART_TIME = 2;
		int SALARY_PER_HOUR = 20;
		//variable
		int emphrs = 0;

		double empcheck = Math.floor(Math.random() * 10) % 2;

		if (empcheck == IS_PRESENT)
			emphrs=12;
		else if (empcheck == IS_PART_TIME)
			emphrs=8;
		else
			emphrs=0;

		double empwage = emphrs * SALARY_PER_HOUR;
		System.out.println("Employee has earned \t" + empwage + "\t $ dollor today");
		}
	public static void main(String[] args) {
		employeeWageCalculation();
		
	}
}
