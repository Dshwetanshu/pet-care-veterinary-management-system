/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Organization;

import petCare.Role.GovernmentHealthOfficerRole;
import petCare.Role.GovernmentSecretaries;
import petCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeelpatel
 */
public class SecretaryOrganization extends Organization {

    public SecretaryOrganization() {
        super(Organization.Type.Secretary.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentSecretaries());
        return roles;
    }
    
}
