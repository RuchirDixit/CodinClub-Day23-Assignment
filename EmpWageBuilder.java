public class EmpWageBuilder
{
	public static void main(String args[])
	{
		//System.out.println("Welcome to Employee Wage Computation Program");
		final int IS_PRESENT=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck == IS_PRESENT)
			System.out.println("Emp is present");
		else
			System.out.println("Emp is absent");
	}
}
