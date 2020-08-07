public class EmpWageBuilder
{
	 final static int IS_FULL_TIME=1;
    final static int IS_PART_TIME=2;

	public static String company;
	public static int numOfWorkingDays,numOfWorkingHours,empRatePerHr;

	public EmpWageBuilder(String company,int numOfWorkingDays,int numOfWorkingHours,int empRatePerHr)
	{
		this.company=company;
		this.numOfWorkingDays=numOfWorkingDays;
		this.numOfWorkingHours=numOfWorkingHours;
		this.empRatePerHr=empRatePerHr;
	}

	public static void computeEmpWage()
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
		EmpWageBuilder dMart=new EmpWageBuilder("Dmart",20,10,10);
		dMart.computeEmpWage();
		EmpWageBuilder reliance=new EmpWageBuilder("Reliance",25,12,25);
      reliance.computeEmpWage();
	}
}
