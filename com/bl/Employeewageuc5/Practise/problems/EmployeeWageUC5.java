package com.bl.Employeewageuc5.Practise.problems;

public class EmployeeWageUC5 {
	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;
	static final int SALARY_PER_HRS = 20;
	static final int NUM_OF_WORK_DAYS = 20;

	public void wageCalculation() {
		int empcheck = 0; int Totalempsalary = 0;
		for ( int day = 0; day < NUM_OF_WORK_DAYS; day++) {
			empcheck =(int) Math.floor(Math.random() * 10) % 3;

			int emphr = 0;

			switch(empcheck) {
			case IS_PRESENT :
				emphr = 12;
				break;

			case IS_PART_TIME :
				emphr = 8;
				break;

			default:
				emphr = 0;
				break;
			}
			double empsalary = emphr * SALARY_PER_HRS;
			Totalempsalary += empsalary;
			System.out.println("empsalary \t"+empsalary);

		}
		System.out.println( "Total employee salary \t" +Totalempsalary );

	}
	public static void main(String[] args) { 
		EmployeeWageUC5 emp5 = new EmployeeWageUC5();
		emp5.wageCalculation();
		}
}
