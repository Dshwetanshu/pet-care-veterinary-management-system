/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Organization;

import petCare.Role.GovernmentHealthOfficerRole;
import petCare.Role.InsAgentRole;
import petCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeelpatel
 */
public class InsAgentOrganization extends Organization {

    public InsAgentOrganization() {
        super(Organization.Type.InsuranceAgent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsAgentRole());
        return roles;
    }
    
}
