package Lesson_9_Employee_Homework;

public class EmployeeCreator {
    public static void main(String[] args) {
        Employee employee1 = new Employee("001","Dio","Brando",3000.25);
        System.out.println(employee1);
        employee1.getFullName();
        System.out.println(employee1.getId());
        System.out.println(employee1.getAnnualSalary(employee1.salaryPerMonth));
        Employee employee2 = new Employee("002","Joseph","Joestar",6030.23);
        System.out.println(employee2);
        System.out.println(employee2.getFirstName());
        System.out.println(employee2.getSalaryPerMonth());
        employee2.raiseSalary(100);
        System.out.println(employee2.getSalaryPerMonth());


    }
}
