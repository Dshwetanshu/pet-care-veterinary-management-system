/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Organization;

import petCare.Employee.EmployeeDirectory;

/**
 *
 * @author DWIJ
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1;

    public enum Type {
        Admin("Admin Organization"),
        Accountant("Accountant Organization"),
        Manager("Manager Organization"),
        Transport("Transport Organization"),
        Veterinarian("Veterinarian Organization"),
        Lab("Lab Organization"),
        InsuranceAgent("Insurance Agent Organization"),
        InsurancePolicyPlanner("Insurance Policy Planner Organization"),
        InsuranceFinanceOrganization("Insurance Finance Organization"),
        HealthcareOfficer("Healthcare Officer Organization"),
        Secretary("Secretary Organization"),
        Treasurer("Treasurer Organization");

        private String value;
        private Type(String value) { this.value = value; }
        public String getValue() { return value; }
        @Override public String toString() { return value; }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter++;
    }

    public abstract Type getType();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public WorkQueue getWorkQueue() { return workQueue; }
    public EmployeeDirectory getEmployeeDirectory() { return employeeDirectory; }
    public UserAccountDirectory getUserAccountDirectory() { return userAccountDirectory; }
    public int getOrganizationID() { return organizationID; }
    @Override public String toString() { return name; }
}
