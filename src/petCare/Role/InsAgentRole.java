/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.InsAgentOrganization;
import petCare.Organization.Organization;
import petCare.Organization.TreasurerOrganization;
import petCare.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.GovernmentTreasurerRole.TreasurerWorkAreaJPanel;
import userinterface.InsuranceAgentRole.InsuranceAgentWorkAreaJPanel;

/**
 *
 * @author sid
 */
public class InsAgentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
     return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, (InsAgentOrganization)organization, enterprise);
    }
    
}
