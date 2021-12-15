package com.bl.Employeewageuc6.Practise.problems;
import static com.bl.Employeewageuc6.Practise.problems.EmployeeWageUC6.TOTAL_WORK_DAY;
import static com.bl.Employeewageuc6.Practise.problems.EmployeeWageUC6.FULL_DAY_WORKING_HOUR;
import static com.bl.Employeewageuc6.Practise.problems.EmployeeWageUC6.MAX_WORKING_HOUR;
import static com.bl.Employeewageuc6.Practise.problems.EmployeeWageUC6.SALARY_PER_HOUR;

public class EmployeeWage {
	static int totalSalary;
	static int empHrs;
	
	public static void main(String[] args) {
		EmployeeWageUC6 emp = new EmployeeWageUC6();
		int day = 0;
		while(day < TOTAL_WORK_DAY && (empHrs+FULL_DAY_WORKING_HOUR) <= MAX_WORKING_HOUR) {
			day++;
			int workingHour = emp.getWorkingHour(emp.isEmpPrasent());
			empHrs += workingHour;
		}
		totalSalary = empHrs*SALARY_PER_HOUR;
		System.out.println("monthly emp wage :"+totalSalary+"\nTotal working hours :"+empHrs);
	}
}
