package exercise_4;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        // Add employees for Testing Purpose
        system.addEmployee(new Employee(101, "Rohit", "Team Lead", 90000));
        system.addEmployee(new Employee(102, "Rohan", "Software Engineer", 86000));
        system.addEmployee(new Employee(103, "Aman", "Data Analyst", 34000));
        system.addEmployee(new Employee(104, "Suman", "UI/UX Designer", 50000));
        system.addEmployee(new Employee(105, "Kiran", "HR Executive", 62000));

        // Traverse employees
        System.out.println("Employee List:");
        system.traverseEmployees();

        // Search for an employee - TESTING PURPOSE
        System.out.println("\nSearching for Employee with ID 103:");
        Employee emp = system.searchEmployee(103);

        if (emp != null) {
            System.out.println("Employee found: " + emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting Employee with ID 102:");
        boolean isDeleted = system.deleteEmployee(102);

        if (isDeleted) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traverse employees again
        System.out.println("\nEmployee List after Deletion:");
        system.traverseEmployees();
    }
}