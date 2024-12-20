import java.util.Arrays;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    // Implementing compareTo method for sorting by salary using custom logic
    @Override
    public int compareTo(Employee other) {
        if (this.salary > other.salary) {
            return 1;
        } else if (this.salary < other.salary) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 1, "HR", 60000);
        Employee emp2 = new Employee("Bob", 2, "IT", 75000);
        Employee emp3 = new Employee("Charlie", 3, "Finance", 50000);
        Employee emp4 = new Employee("David", 4, "Marketing", 65000);

        Employee[] employees = {emp1, emp2, emp3, emp4};

        // Sort employees by salary
        Arrays.sort(employees);

        // Display sorted employee details
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }
    }
}
