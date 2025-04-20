/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.AccountantOrganization;
import petCare.Organization.ManagerOrganization;
import petCare.Organization.Organization;
import petCare.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmaManagerRole.ManageMenuJPanel;
import userinterface.PharmaManagerRole.ManagerWorkAreaJPanel;

/**
 *
 * @author sid
 */
public class ManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new ManagerWorkAreaJPanel(userProcessContainer, account,(ManagerOrganization)organization, enterprise);
    }
    
}
