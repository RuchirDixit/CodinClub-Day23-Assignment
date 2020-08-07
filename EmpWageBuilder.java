public class EmpWageBuilder
{
	public static void main(String args[])
	{
		//System.out.println("Welcome to Employee Wage Computation Program");
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_RATE_PER_HR=20;
		int empHrs=0;
		int dailyWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if (empCheck == IS_FULL_TIME)
			empHrs=8;
		else if (empCheck == IS_PART_TIME)
			empHrs=4;
		dailyWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("Daily wage of employee is:"+dailyWage);
	}
}
