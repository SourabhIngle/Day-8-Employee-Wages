public class EmployeeWages {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wages program");

        //constants
        int IS_PRESENT = 1;
        int IS_PART_TIME = 2;
        int IS_ABSENT = 0;
        final int EMP_RATE_PER_HR = 20;
        final int TOTAL_WORKING_DAYS = 20;
        final int TOTAL_WORKING_HOURS = 100;

        //variables;
        int empHrs;
        int totalEarnings = 0;
        int dailyWage;
        int empDays = 0;
        int workingHrs = 0;

        for (int i = 0; i < TOTAL_WORKING_DAYS && i < TOTAL_WORKING_HOURS; i++) {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            empDays++;
            switch (random) {
                case 1:
                    empHrs = 8;
                    dailyWage = empHrs * EMP_RATE_PER_HR;
                    totalEarnings = totalEarnings + dailyWage;
                    workingHrs = workingHrs + empHrs;
                    System.out.println("Earning till Day " + empDays + " is: " + totalEarnings);
                    break;
                case 2:
                    empHrs = 4;
                    dailyWage = empHrs * EMP_RATE_PER_HR;
                    totalEarnings = totalEarnings + dailyWage;
                    workingHrs = workingHrs + empHrs;
                    System.out.println("Earning till Day " + empDays + " is: " + totalEarnings);
                    break;
                default:
                    empHrs = 0;
                    dailyWage = empHrs * EMP_RATE_PER_HR;
                    totalEarnings = totalEarnings + dailyWage;
                    workingHrs = workingHrs + empHrs;
                    System.out.println("Earning till Day " + empDays + " is: " + totalEarnings);
                    break;
            }
        }
        System.out.println("Employee has earned " + totalEarnings + " in a month and has worked for " + workingHrs + " hours in total");
    }
}
