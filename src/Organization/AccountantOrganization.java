/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author DWIJ
 */

import petCare.Role.AccountantRole;
import petCare.Role.Role;
import java.util.ArrayList;

public class AccountantOrganization extends Organization {

    public AccountantOrganization() {
        super(Organization.Type.Accountant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AccountantRole());
        return roles;
    }

    @Override
    public Type getType() {
        return Type.Accountant;
    }
}