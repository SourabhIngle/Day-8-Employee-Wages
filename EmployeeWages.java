public class EmployeeWages {
    public static void main(String[] args) {

        // CONSTANT VARIABLE
        final int IS_FULL_TIME = 1;

        // Generate random number between 0 or 1.
        int random = (int) ((Math.random() * 10) % 2);
        System.out.println(random);

        //Check employee is present or absent.
        if (random == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
