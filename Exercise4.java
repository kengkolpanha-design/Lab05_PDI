class Employee {
    private int id;
    private String name;
    private String department;
    private String position;
    private double salary;

    // Constructor to initialize attributes
    public Employee(int id, String name, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    // Public getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        // Instantiate using the constructor
        Employee emp = new Employee(101, "John Doe", "Engineering", "Software Engineer", 60000.0);

        System.out.println("--- Initial Employee Details ---");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary: $" + emp.getSalary());

        // Update values using setters
        emp.setPosition("Senior Software Engineer");
        emp.setSalary(75000.0);

        System.out.println("\n--- Updated Employee Details ---");
        System.out.println("New Position: " + emp.getPosition());
        System.out.println("New Salary: $" + emp.getSalary());
    }
}