package com.bl.Employeewageuc2.Practise.problems;

public class EmployeeWageUC2 {
	public void employeeWageCalculation() {
		int IS_PRESENT=1;
		int SALARY_PER_HRS=20;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		int workinghrs=0;
		if ( empcheck == IS_PRESENT ){
			workinghrs=8;


		}
		double empsalary = workinghrs * SALARY_PER_HRS;
		System.out.println(" Employee earned " +empsalary);
	}
	public static void main(String[] args) {
		EmployeeWageUC2 calc = new EmployeeWageUC2();
		calc.employeeWageCalculation();
		
	}

}
