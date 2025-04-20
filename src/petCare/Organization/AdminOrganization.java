/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Organization;

import petCare.Role.EnterpriseAdminRole;
import petCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeelpatel
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
     
}
