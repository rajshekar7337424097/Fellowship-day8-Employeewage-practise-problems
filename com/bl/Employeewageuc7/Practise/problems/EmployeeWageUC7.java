package com.bl.Employeewageuc7.Practise.problems;

public class EmployeeWageUC7 {
	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;
	private static final int FULL_DAY_WORKING_HOUR = 0;
	public static void employeewage(int SALARY_PER_HOUR, int TOTAL_WORK_DAY, int MAX_WORKING_HOUR, int FULL_DAY_WORKING_DAY ) {
		int empCheck  = 0;
		int empHrs = 0;
		int totalSalary = 0;
		int day = 0;
		while(day<TOTAL_WORK_DAY && (empHrs+FULL_DAY_WORKING_HOUR) <= MAX_WORKING_HOUR) {
			day++;
			empCheck= (int)(Math.floor(Math.random()*10) % 3);
			switch (empCheck) {
			case IS_PRESENT:
				empHrs+=FULL_DAY_WORKING_HOUR;
				break;
			case IS_PART_TIME:
				empHrs+=(FULL_DAY_WORKING_HOUR/2);
				break;
			default:
				empHrs+=0;
				break;
			}
			System.out.println("working day :"+day+"(Present : "+empCheck+")");
			
		}
		int SALARI_PER_HOUR = 0;
		totalSalary = empHrs*SALARI_PER_HOUR;
		System.out.println("Monthly salary of emp : "+totalSalary+"\nTotalworking :"+empHrs);
	}
	public static void main(String[] args) {
		employeewage(20, 20, 100, 8);
		}
}
