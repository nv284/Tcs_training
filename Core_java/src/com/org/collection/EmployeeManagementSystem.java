package com.org.collection;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private double salary;
    private String skill;

    public Employee(String name, double salary, String skill) {
        this.name = name;
        this.salary = salary;
        this.skill = skill;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", skill='" + skill + "'}";
    }
}
public class EmployeeManagementSystem {
	 private Map<Integer, Employee> employeeMap;

	    public EmployeeManagementSystem() {
	        employeeMap = new HashMap<>();
	    }

	    // Add a new employee
	    public void addEmployee(int empid, Employee employee) {
	        employeeMap.put(empid, employee);
	        System.out.println("Employee added: " + employee);
	    }

	    // Remove an employee
	    public void removeEmployee(int empid) {
	        Employee removedEmployee = employeeMap.remove(empid);
	        if (removedEmployee != null) {
	            System.out.println("Employee removed: " + removedEmployee);
	        } else {
	            System.out.println("Employee with empid " + empid + " not found.");
	        }
	    }

	    // Display all employees
	    public void displayAllEmployees() {
	        if (employeeMap.isEmpty()) {
	            System.out.println("No employees found.");
	        } else {
	            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
	                System.out.println("EmpID: " + entry.getKey() + ", Details: " + entry.getValue());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        EmployeeManagementSystem ems = new EmployeeManagementSystem();

	        // Add employees
	        ems.addEmployee(101, new Employee("John Doe", 50000, "Java Developer"));
	        ems.addEmployee(102, new Employee("Jane Smith", 60000, "Project Manager"));
	        ems.addEmployee(103, new Employee("Mike Johnson", 55000, "QA Engineer"));

	        // Display all employees
	        System.out.println("\nAll Employees:");
	        ems.displayAllEmployees();

	        // Remove an employee
	        ems.removeEmployee(102);

	        // Display all employees after removal
	        System.out.println("\nAll Employees after removal:");
	        ems.displayAllEmployees();
	        
	    }
}
