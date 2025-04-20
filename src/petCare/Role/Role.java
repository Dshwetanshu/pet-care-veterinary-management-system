/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Role;

import petCare.EcoSystem;
import petCare.Enterprise.Enterprise;
import petCare.Organization.Organization;
import petCare.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Patient("Patient"),
        Accountant("Accountant"),
        InsuranceAgent("Insurance Agent"),
        InsurancePlanner("Insurance Planner"),
        InsuranceFinanceManager("Insurance Finance Manager"),
        GovernmentHealthOfficer("Government Health Officer"),
        GovernmentTreasurer("Government Treasurer"),
        GovernmentSecretary("Government Secretary"),
        PharmaTransport("Pharmacy Transport"),
        PharmaManager("Pharmacy Manager")
        ;
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecosystem);

@Override
public String toString() {
    String[] parts = this.getClass().getName().split("\\.");
    return parts.length > 0 ? parts[parts.length - 1] : this.getClass().getName();
}

    
    
}