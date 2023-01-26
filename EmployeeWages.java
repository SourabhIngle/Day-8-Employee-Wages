public class EmployeeWages {
    public static void main(String[] args) {

        // CONSTANT VALUES
        int IS_PRESENT = 1;

        final int EMP_RATE_PER_HR = 20;
        final int EMP_HRS = 8;

        // Generate random number between 0 or 1
        int random = (int) (Math.floor(Math.random() * 10) % 2);
        System.out.println(random);

        int EmpWage;
        if (random == IS_PRESENT) {
            EmpWage = (EMP_RATE_PER_HR * EMP_HRS);
        } else {
            EmpWage = 0;
        }
        System.out.println("Daily Wage of the Employee is: " + EmpWage);
    }

}