/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Organization;

import petCare.Role.GovernmentHealthOfficerRole;
import petCare.Role.GovernmentTreasurer;
import petCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeelpatel
 */
public class TreasurerOrganization extends Organization {

   public TreasurerOrganization() {
        super(Organization.Type.Treasurer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentTreasurer());
        return roles;
    }
    
}
