public class EmpWageBuilder
{
	public static void main(String args[])
	{
		//System.out.println("Welcome to Employee Wage Computation Program");
		final int IS_PRESENT=1;
		final int EMP_RATE_PER_HR=20;
		int empHrs=0;
		int dailyWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck == IS_PRESENT)
			empHrs=8;
		dailyWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("Daily wage of employee is:"+dailyWage);
	}
}
