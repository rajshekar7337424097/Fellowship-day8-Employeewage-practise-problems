package com.bl.Employeewageuc6.Practise.problems;

public class EmployeeWageUC6 {
		static final int IS_PRESENT = 1;
		static final int IS_PART_TIME = 2;
		static final int SALARY_PER_HOUR = 20;
		static final int TOTAL_WORK_DAY = 20;
		static final int MAX_WORKING_HOUR = 100;
		static final int FULL_DAY_WORKING_HOUR = 8;
		
		
		
		public int  isEmpPrasent() {
				return  (int)(Math.floor(Math.random() * 10) % 3);
		}
		public int getWorkingHour(int empCheck) {
			int empHr;
				switch(empCheck) {
					case IS_PRESENT :
						empHr = FULL_DAY_WORKING_HOUR;
					break;

					case IS_PART_TIME :
						empHr = (FULL_DAY_WORKING_HOUR/2);
					break;

					default :
						empHr = 0;
					break;
				}
				return empHr;
			}
	
		}
	




