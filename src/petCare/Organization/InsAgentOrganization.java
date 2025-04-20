/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Organization;

/**
 *
 * @author DWIJ
 */
import petCare.Role.InsAgentRole;
import petCare.Role.Role;
import java.util.ArrayList;

public class InsAgentOrganization extends Organization {

    public InsAgentOrganization() {
        super(Type.InsuranceAgent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsAgentRole());
        return roles;
    }

    @Override
    public Type getType() {
        return Type.InsuranceAgent;
    }
}

