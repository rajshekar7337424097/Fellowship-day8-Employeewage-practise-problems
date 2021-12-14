package com.bl.Employeewageuc4.Practise.problems;

public class EmployeeWageUC4 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int SALARY_PER_HRS = 20;
	public static void employeeWage() {
		int emphrs=0;
		int empcheck=(int) Math.floor(Math.random() *10 ) % 3;
		switch (empcheck)  {
		case IS_FULL_TIME:
			emphrs=12;
			break;

		case IS_PART_TIME:
			emphrs=8;
			break;

		default:
			emphrs=0;
		}
		double empwage = emphrs * SALARY_PER_HRS;
		System.out.println("employee salary " +empwage);
	}
	public static void main(String[] args) {
		employeeWage();
	}

}