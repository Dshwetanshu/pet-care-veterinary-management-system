package petCare.Enterprise;

import petCare.Insurance.InsurancePolicyDirectory;
import petCare.InsuranceCustomer.InsuranceCustomerDirectory;
import petCare.Organization.Organization;
import petCare.Organization.Organization.Type;
import petCare.Role.Role;

import java.util.ArrayList;
import java.util.List;

public class PetInsuranceEnterprise extends Enterprise {

    private InsuranceCustomerDirectory insuranceCustomerDirectory;
    private InsurancePolicyDirectory insurancePolicyDirectory;

    public PetInsuranceEnterprise(String name, int zip, String address) {
        super(name, EnterpriseType.PetInsurance, zip, address);
        insuranceCustomerDirectory = new InsuranceCustomerDirectory();
        insurancePolicyDirectory = new InsurancePolicyDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Type> getAllOrganizationTypes() {
        List<Type> orgTypes = new ArrayList<>();
        orgTypes.add(Type.InsuranceAgent);
        orgTypes.add(Type.InsurancePolicyPlanner);
        orgTypes.add(Type.InsuranceFinanceOrganization);
        return orgTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
        return insuranceCustomerDirectory;
    }

    public InsurancePolicyDirectory getInsurancePolicyDirectory() {
        return insurancePolicyDirectory;
    }
}
