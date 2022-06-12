package Lesson_9_Employee_Homework;

public class Employee {
    final String id;
    final String firstName;
    final String lastName;
    double salaryPerMonth;

    public Employee(String id, String firstName, String lastName,double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }
    public String getId() {
        return id;
    }
    public String getFullName() {
        return this.firstName+""+this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public double setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
        return salaryPerMonth;
    }
    public double getAnnualSalary(double salaryPerMonth){
     return   salaryPerMonth *12;
    }
    public double raiseSalary(double raisePercentage){
       double salaryInc = ((salaryPerMonth * raisePercentage)/100);
       double newSalary = salaryInc+salaryPerMonth;
       return setSalaryPerMonth(newSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }

    public void getAnnualSalary() {
    }
}
