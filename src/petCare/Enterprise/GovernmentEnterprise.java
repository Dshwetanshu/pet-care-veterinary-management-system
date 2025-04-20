/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Enterprise;

import petCare.Organization.Organization;
import petCare.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeelpatel
 */
public class GovernmentEnterprise extends Enterprise {

    public GovernmentEnterprise(String name, int zip, String address) {
        super(name, EnterpriseType.Government, zip,address);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.HealthcareOfficer);
        orgTypes.add(Organization.Type.Secretary);
        orgTypes.add(Organization.Type.Treasurer);

        return orgTypes;
    }

}
