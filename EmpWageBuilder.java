public class EmpWageBuilder
{
	 final static int IS_FULL_TIME=1;
    final static int IS_PART_TIME=2;
    final static int EMP_RATE_PER_HR=20;
    final static int MAX_WORKINGS_DAYS=20;
    final static int MAX_WORKING_HRS=10;

	public static int computeEmpWage()
	{
		int empHrs;
      int dailyWage=0;
      int totalEmpHrs=0;
      int workingDays=0;
      while(workingDays<MAX_WORKINGS_DAYS && totalEmpHrs<=MAX_WORKING_HRS)
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
      }
		System.out.println("Total emp hrs:"+totalEmpHrs);
		return totalEmpHrs;
	}
	public static void main(String args[])
	{
		//System.out.println("Welcome to Employee Wage Computation Program");
		int totalWage=computeEmpWage();
		System.out.println("Wage of Emp after "+MAX_WORKINGS_DAYS+" days is: "+totalWage*EMP_RATE_PER_HR);
	}
}
