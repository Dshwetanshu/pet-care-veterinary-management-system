package petCare.Enterprise;

import petCare.Organization.Organization;
import petCare.Organization.OrganizationDirectory; 
import java.util.List;

public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int zipcode;
    private String address;
    private String email;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        VeterinaryClinic("VeterinaryClinic"),
        PetInsurance("PetInsurance"),
        PetRetail("PetRetail");

        private String value;

        EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type, int zip, String address) {
        super(name);
        this.enterpriseType = type;
        this.zipcode = zip;
        this.address = address;
        this.email = "admin@petcare.org";
        organizationDirectory = new OrganizationDirectory();
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract List<Organization.Type> getAllOrganizationTypes();
}
