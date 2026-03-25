import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

abstract class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected String employeeId;
    protected String name;
    protected String contactNumber;
    protected double baseSalary;
    protected int workingDays;
    protected static final int TOTAL_WORKING_DAYS = 26;
    
    public Employee(String employeeId, String name, String contactNumber, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.baseSalary = baseSalary;
        this.workingDays = 0;
    }
    
    // Abstract method - demonstrates polymorphism
    public abstract double calculateSalary();
    
    public abstract String getRole();
    
    // Getters and Setters
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getContactNumber() { return contactNumber; }
    public double getBaseSalary() { return baseSalary; }
    public int getWorkingDays() { return workingDays; }
    
    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
    
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Contact: " + contactNumber);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Working Days: " + workingDays + "/" + TOTAL_WORKING_DAYS);
        System.out.println("Net Salary: ₹" + String.format("%.2f", calculateSalary()));
    }
}

// Manager.java - Subclass
class Manager extends Employee {
    private static final long serialVersionUID = 1L;
    private double performanceBonus;
    private double allowance;
    
    public Manager(String employeeId, String name, String contactNumber, double baseSalary) {
        super(employeeId, name, contactNumber, baseSalary);
        this.performanceBonus = 5000;
        this.allowance = 3000;
    }
    
    public double calculateSalary() {
        double attendanceRatio = (double) workingDays / TOTAL_WORKING_DAYS;
        double salary = (baseSalary * attendanceRatio) + performanceBonus + allowance;
        return salary;
    }
    
    public String getRole() {
        return "Manager";
    }
}

// Clerk.java - Subclass
class Clerk extends Employee {
    private static final long serialVersionUID = 1L;
    private double overtimeHours;
    private static final double OVERTIME_RATE = 100;
    
    public Clerk(String employeeId, String name, String contactNumber, double baseSalary) {
        super(employeeId, name, contactNumber, baseSalary);
        this.overtimeHours = 0;
    }
    
    public double calculateSalary() {
        double attendanceRatio = (double) workingDays / TOTAL_WORKING_DAYS;
        double salary = (baseSalary * attendanceRatio) + (overtimeHours * OVERTIME_RATE);
        return salary;
    }
    
    public String getRole() {
        return "Clerk";
    }
    
    public void setOvertimeHours(double hours) {
        this.overtimeHours = hours;
    }
}

// FileHandler.java - File I/O Operations
class FileHandler {
    private static final String FILE_NAME = "employees.dat";
    
    // Save employees to file
    public static void saveEmployees(ArrayList<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("\n✓ Data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    
    // Load employees from file
    @SuppressWarnings("unchecked")
    public static ArrayList<Employee> loadEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}

// PayrollSystem.java - Main Class
public class Emp_payroll_system {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        employees = FileHandler.loadEmployees();
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║   EMPLOYEE PAYROLL MANAGEMENT SYSTEM  ║");
        System.out.println("╚═══════════════════════════════════════╝");
        
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    markAttendance();
                    break;
                case 4:
                    calculateAllSalaries();
                    break;
                case 5:
                    searchEmployee();
                    break;
                case 6:
                    removeEmployee();
                    break;
                case 7:
                    FileHandler.saveEmployees(employees);
                    System.out.println("\n✓ Exiting system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\n✗ Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n┌─────────────────────────────┐");
        System.out.println("│         MAIN MENU           │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ 1. Add New Employee         │");
        System.out.println("│ 2. View All Employees       │");
        System.out.println("│ 3. Mark Attendance          │");
        System.out.println("│ 4. Calculate Salaries       │");
        System.out.println("│ 5. Search Employee          │");
        System.out.println("│ 6. Remove Employee          │");
        System.out.println("│ 7. Save & Exit              │");
        System.out.println("└─────────────────────────────┘");
    }
    
    private static void addEmployee() {
        System.out.println("\n=== Add New Employee ===");
        
        String empId = getStringInput("Enter Employee ID: ");
        
        // Check for duplicate ID
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(empId)) {
                System.out.println("✗ Employee ID already exists!");
                return;
            }
        }
        
        String name = getStringInput("Enter Name: ");
        String contact = getStringInput("Enter Contact Number: ");
        double baseSalary = getDoubleInput("Enter Base Salary: ");
        
        System.out.println("\nSelect Role:");
        System.out.println("1. Manager");
        System.out.println("2. Clerk");
        int roleChoice = getIntInput("Enter choice: ");
        
        Employee employee = null;
        
        if (roleChoice == 1) {
            employee = new Manager(empId, name, contact, baseSalary);
        } else if (roleChoice == 2) {
            employee = new Clerk(empId, name, contact, baseSalary);
        } else {
            System.out.println("✗ Invalid role selection!");
            return;
        }
        
        employees.add(employee);
        FileHandler.saveEmployees(employees);
        System.out.println("\n✓ Employee added successfully!");
    }
    
    private static void viewAllEmployees() {
        System.out.println("\n=== All Employees ===");
        
        if (employees.isEmpty()) {
            System.out.println("No employees found in the system.");
            return;
        }
        
        System.out.println("\n" + String.format("%-10s %-20s %-15s %-15s %-12s", 
            "ID", "Name", "Role", "Base Salary", "Working Days"));
        System.out.println("─".repeat(75));
        
        for (Employee emp : employees) {
            System.out.println(String.format("%-10s %-20s %-15s ₹%-14.2f %-12s", 
                emp.getEmployeeId(),
                emp.getName(),
                emp.getRole(),
                emp.getBaseSalary(),
                emp.getWorkingDays() + "/26"));
        }
    }
    
    private static void markAttendance() {
        System.out.println("\n=== Mark Attendance ===");
        String empId = getStringInput("Enter Employee ID: ");
        
        Employee employee = findEmployee(empId);
        if (employee == null) {
            System.out.println("✗ Employee not found!");
            return;
        }
        
        int days = getIntInput("Enter number of working days (0-26): ");
        
        if (days < 0 || days > 26) {
            System.out.println("✗ Invalid number of days!");
            return;
        }
        
        employee.setWorkingDays(days);
        
        if (employee instanceof Clerk) {
            double overtime = getDoubleInput("Enter overtime hours: ");
            ((Clerk) employee).setOvertimeHours(overtime);
        }
        
        FileHandler.saveEmployees(employees);
        System.out.println("✓ Attendance marked successfully!");
    }
    
    private static void calculateAllSalaries() {
        System.out.println("\n=== Salary Calculation Report ===");
        
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }
        
        System.out.println("\n" + String.format("%-10s %-20s %-15s %-15s", 
            "ID", "Name", "Role", "Net Salary"));
        System.out.println("─".repeat(65));
        
        double totalSalary = 0;
        
        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            totalSalary += salary;
            System.out.println(String.format("%-10s %-20s %-15s ₹%-14.2f", 
                emp.getEmployeeId(),
                emp.getName(),
                emp.getRole(),
                salary));
        }
        
        System.out.println("─".repeat(65));
        System.out.println(String.format("%-45s ₹%-14.2f", "TOTAL PAYROLL:", totalSalary));
    }
    
    private static void searchEmployee() {
        System.out.println("\n=== Search Employee ===");
        String empId = getStringInput("Enter Employee ID: ");
        
        Employee employee = findEmployee(empId);
        if (employee == null) {
            System.out.println("✗ Employee not found!");
        } else {
            employee.displayDetails();
        }
    }
    
    private static void removeEmployee() {
        System.out.println("\n=== Remove Employee ===");
        String empId = getStringInput("Enter Employee ID: ");
        
        Employee employee = findEmployee(empId);
        if (employee == null) {
            System.out.println("✗ Employee not found!");
            return;
        }
        
        String confirm = getStringInput("Are you sure you want to remove " + employee.getName() + "? (yes/no): ");
        if (confirm.equalsIgnoreCase("yes")) {
            employees.remove(employee);
            FileHandler.saveEmployees(employees);
            System.out.println("✓ Employee removed successfully!");
        } else {
            System.out.println("✗ Operation cancelled.");
        }
    }
    
    private static Employee findEmployee(String empId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(empId)) {
                return emp;
            }
        }
        return null;
    }
    
    // Utility methods for input
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("✗ Invalid input! Please enter a number.");
            }
        }
    }
    
    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("✗ Invalid input! Please enter a valid number.");
            }
        }
    }
}
