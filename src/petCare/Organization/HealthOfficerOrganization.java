/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Organization;

/**
 *
 * @author DWIJ
 */
import petCare.Role.GovernmentHealthOfficerRole;
import petCare.Role.Role;
import java.util.ArrayList;

public class HealthOfficerOrganization extends Organization {

    public HealthOfficerOrganization() {
        super(Type.HealthcareOfficer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentHealthOfficerRole());
        return roles;
    }

    @Override
    public Type getType() {
        return Type.HealthcareOfficer;
    }
}
