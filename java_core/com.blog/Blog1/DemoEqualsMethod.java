public class DemoEqualsMethod {
    public static void main(String[] args) {

        /*
        * here we try to compare two employee with equals() method
        **/

        Employee employee1 = new Employee(1001,"Emma","Watson");
        Employee employee2 = new Employee(1002,"Jose","Watson");

        boolean isEquals = employee1.equals(employee2); // false

        // We would expect income.equals(expenses) to return true,
        // but both are from different object so hashcode of both object are different
        // so its return false

        System.out.printf("isEquals %b",isEquals);
    }
}
