package Employee2;

import java.time.LocalDate;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Khen Juntilla", 150000, LocalDate.of(2001, 6, 15));
        Employee emp2 = new Employee("Elon Musk", 149000, LocalDate.of(2002, 9, 30));

        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
    }
}
