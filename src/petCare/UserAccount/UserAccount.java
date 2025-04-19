package petCare.UserAccount;

import petCare.Employee.Employee;
import petCare.Pet.Pet;
import petCare.Role.Role;

public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private Pet pet;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    @Override
    public String toString() {
        return username;
    }
}
