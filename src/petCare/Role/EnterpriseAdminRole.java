/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.Organization;
import petCare.UserAccount.UserAccount;
import userinterface.AdministrativeRole.EnterpriseAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class EnterpriseAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new EnterpriseAdminWorkAreaJPanel(userProcessContainer, enterprise, account,ecosystem);
    }

    
    
}
