/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.Organization;
import petCare.UserAccount.UserAccount;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
