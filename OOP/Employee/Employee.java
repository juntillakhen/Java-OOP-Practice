package Employee;

public class Employee {
    private String name;
    private String jobtitle;
    private double salary;

    public Employee(String name, String jobtitle, double salary){
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getJobtitle(){
        return jobtitle;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        if (percentage > 0){
            double increase = salary * (percentage / 100);
            salary += increase;
            System.out.println(name +"'s salary increased by " + percentage + "%");
        } else {
            System.out.println("Invalid percentage. It must be greater than 0.");
        }
    }
    public double getYearlySalary(){
        return salary * 12;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobtitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Salary: " + getYearlySalary());
    }

    
}
