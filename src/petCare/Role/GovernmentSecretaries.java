/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.HealthOfficerOrganization;
import petCare.Organization.Organization;
import petCare.Organization.SecretaryOrganization;
import petCare.UserAccount.UserAccount;
import javax.swing.JPanel;
import Userinterface.GovernmentSecretaryRole.SecretaryWorkAreaJPanel;
import userinterface.HealthcareOfficerRole.OfficerWorkAreaJPanel;

/**
 *
 * @author Dwij
 */
public class GovernmentSecretaries extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SecretaryWorkAreaJPanel(userProcessContainer, userAccount, (SecretaryOrganization)organization, enterprise);
    }
    
}
