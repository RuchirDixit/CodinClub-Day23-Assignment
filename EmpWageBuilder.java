public class EmpWageBuilder
{
	 final static int IS_FULL_TIME=1;
    final static int IS_PART_TIME=2;

	public static void computeEmpWage(String company,int numOfWorkingDays,int numOfWorkingHours,int empRatePerHr)
	{
		int empHrs;
      int dailyWage=0;
      int totalEmpHrs=0;
      int workingDays=0;
      while(workingDays<numOfWorkingDays && totalEmpHrs<=numOfWorkingHours)
      {
         workingDays++;
         double empCheck=Math.floor(Math.random()*10)%3;
         switch((int)empCheck)
         {
            case IS_FULL_TIME:
                  empHrs=8;
                  break;
            case IS_PART_TIME:
                  empHrs=4;
                  break;
            default:
                  empHrs=0;
                  break;
         }
      	totalEmpHrs+=empHrs;
			System.out.println("Employee's Wage for day "+workingDays+" is:"+empHrs);
      }
		System.out.println("Wage of Employee of "+company+" company after working for "+workingDays+" days is:"+totalEmpHrs*empRatePerHr);
	}
	public static void main(String args[])
	{
		//System.out.println("Welcome to Employee Wage Computation Program");
		computeEmpWage("BridgeLabz",20,10,20);
		computeEmpWage("Google",20,12,30);
	}
}
