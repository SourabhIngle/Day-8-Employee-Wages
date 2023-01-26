public class EmployeeWages {
    public static void main(String[] args) {

        // CONSTANT VALUES
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        final int EMP_RATE_PER_HR = 20;

        //variables

        int EmpWorkingHrs;
        int TotalEarnings;

        int random = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(random);

        if (IS_FULL_TIME == random) {
            EmpWorkingHrs = 8;
            TotalEarnings = (EmpWorkingHrs * EMP_RATE_PER_HR);
            System.out.println("Employee is Full Time with salary: " + TotalEarnings);
        } else if (IS_PART_TIME == random) {
            EmpWorkingHrs = 4;
            TotalEarnings = (EmpWorkingHrs * EMP_RATE_PER_HR);
            System.out.println("Employee is Part Time with Salary: " + TotalEarnings);
        } else {
            TotalEarnings = 0;
            System.out.println("Employee is Absent, hence salary: " + TotalEarnings);

        }

    }

}