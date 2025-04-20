/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.InsFinanceOrganization;
import petCare.Organization.InsPolicyPlannerOrganization;
import petCare.Organization.Organization;
import static petCare.Organization.Organization.Type.InsuranceFinanceOrganization;
import petCare.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InsuranceFinanceRole.InsuranceFinanceWorkAreaJPanel;
import userinterface.InsurancePlannerRole.InsurancePlannerWorkAreaJPanel;

/**
 *
 * @author sid
 */
public class InsFinanceManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceFinanceWorkAreaJPanel(userProcessContainer, account, (InsFinanceOrganization)organization, enterprise);
    }
    
}
