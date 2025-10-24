package Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Khen Juntilla", "CEO", 150000);
        Employee emp2 = new Employee("Elon Musk", "Co-Founder", 149900);

        System.out.println("Initial Employee Details:");
        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();

        System.out.println("\nUpdating Salaries...");
        emp1.increaseSalary(10);  
        emp2.increaseSalary(5);   

        System.out.println("\nUpdated Employee Details:");
        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
    }
}
