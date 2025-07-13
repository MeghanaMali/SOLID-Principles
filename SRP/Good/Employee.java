package SRP.Good;

public class Employee {

    private String name;
    private String address;
    private String phoneNumber;

    public Employee(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

//   Getters and setters for name, address, and phoneNumber
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}

class EmployeeDatabase {

    public void saveToDatabase(Employee employee) {
        // Code to save employee details to the database
    }
    
}

class EmployeeEmailService {
    public void sendEmail(Employee employee) {
        // Code to send an email to the employee
    }
    
}

class EmployeePrinter {

    public void printDetails(Employee employee) {
        // Code to print employee details
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
    }
    
}
