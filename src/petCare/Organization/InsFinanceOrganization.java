/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Organization;

/**
 *
 * @author DWIJ
 */
import petCare.Role.InsFinanceManagerRole;
import petCare.Role.Role;
import java.util.ArrayList;

public class InsFinanceOrganization extends Organization {

    public InsFinanceOrganization() {
        super(Type.InsuranceFinanceOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsFinanceManagerRole());
        return roles;
    }

    @Override
    public Type getType() {
        return Type.InsuranceFinanceOrganization;
    }
}