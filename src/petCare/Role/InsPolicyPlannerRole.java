/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.InsPolicyPlannerOrganization;
import petCare.Organization.Organization;
import petCare.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InsurancePlannerRole.InsurancePlannerWorkAreaJPanel;

/**
 *
 * @author sid
 */
public class InsPolicyPlannerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsurancePlannerWorkAreaJPanel(userProcessContainer, account, (InsPolicyPlannerOrganization)organization, enterprise);
    }
    
}
