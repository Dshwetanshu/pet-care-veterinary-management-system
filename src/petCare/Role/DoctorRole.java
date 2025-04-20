/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.DoctorOrganization;
import petCare.Organization.Organization;
import petCare.UserAccount.UserAccount;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, userAccount, (DoctorOrganization)organization, enterprise);
    }
    
    
}
