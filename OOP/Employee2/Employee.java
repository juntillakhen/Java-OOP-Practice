package Employee2;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        if ((hireDate != null) && (currentDate.isAfter(hireDate))) {
            return Period.between(hireDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
    }
}
