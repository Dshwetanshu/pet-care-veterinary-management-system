/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.Organization;
import petCare.Organization.SecretaryOrganization;
import petCare.Organization.TreasurerOrganization;
import petCare.UserAccount.UserAccount;
import javax.swing.JPanel;
import Userinterface.GovernmentSecretaryRole.SecretaryWorkAreaJPanel;
import userinterface.GovernmentTreasurerRole.TreasurerWorkAreaJPanel;

/**
 *
 * @author sid
 */
public class GovernmentTreasurer extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TreasurerWorkAreaJPanel(userProcessContainer, userAccount, (TreasurerOrganization)organization, enterprise);
    }
    
}
