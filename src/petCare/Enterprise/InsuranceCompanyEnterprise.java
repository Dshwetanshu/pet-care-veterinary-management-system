/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Enterprise;

import petCare.Insurance.InsurancePolicyDirectory;
import petCare.InsuranceCustomer.InsuranceCustomerDirectory;
import petCare.Organization.Organization;
import petCare.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeelpatel
 */
public class InsuranceCompanyEnterprise extends Enterprise {

    private InsuranceCustomerDirectory insuranceCustomerDirectory;

    private InsurancePolicyDirectory insurancePolicyDirectory;

    public InsuranceCompanyEnterprise(String name, int zip, String address) {
        super(name, EnterpriseType.InsuranceCompany, zip,address);
        insuranceCustomerDirectory = new InsuranceCustomerDirectory();
        insurancePolicyDirectory = new InsurancePolicyDirectory();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsuranceAgent);
        orgTypes.add(Organization.Type.InsurancePolicyPlanner);
        orgTypes.add(Organization.Type.InsuranceFinanceOrganization);

        return orgTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
        return insuranceCustomerDirectory;
    }

    public void setInsuranceCustomerDirectory(InsuranceCustomerDirectory insuranceCustomerDirectory) {
        this.insuranceCustomerDirectory = insuranceCustomerDirectory;
    }

    public InsurancePolicyDirectory getInsurancePolicyDirectory() {
        return insurancePolicyDirectory;
    }

    public void setInsurancePolicyDirectory(InsurancePolicyDirectory insurancePolicyDirectory) {
        this.insurancePolicyDirectory = insurancePolicyDirectory;
    }

}
