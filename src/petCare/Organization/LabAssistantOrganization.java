/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Organization;

import petCare.Role.LabAssistantRole;
import petCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeelpatel
 */
public class LabAssistantOrganization extends Organization{

    public LabAssistantOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
     
   
    
    
}
