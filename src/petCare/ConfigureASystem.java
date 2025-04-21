// ✅ ConfigureASystem.java
package petCare;

import petCare.Employee.Employee;
import petCare.Enterprise.Enterprise;
import petCare.Enterprise.EnterpriseDirectory;
import petCare.Enterprise.VeterinaryClinicEnterprise;
import petCare.Network.Network;
import petCare.Organization.DoctorOrganization;
import petCare.Organization.Organization;
import petCare.Role.EnterpriseAdminRole;
import petCare.Role.SystemAdminRole;
import petCare.UserAccount.UserAccount;

public class ConfigureASystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();

        // Create networks
        Network boston = system.createAndAddNetwork();
        boston.setName("Boston");
        boston.setZip(02101);

        Network newYork = system.createAndAddNetwork();
        newYork.setName("New York");
        newYork.setZip(10001);

        Network california = system.createAndAddNetwork();
        california.setName("California");
        california.setZip(90001);

        // Create system admin user
        Employee sysAdmin = system.getEmployeeDirectory().createEmployee("sysadmin");
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysAdmin, new SystemAdminRole());

        // Add default Veterinary Clinic to Boston
        Enterprise vetClinic = boston.getEnterpriseDirectory().createAndAddEnterprise("PawPal Clinic", Enterprise.EnterpriseType.VeterinaryClinic, 02101, "123 Bark St, Boston");
        Employee clinicAdmin = vetClinic.getEmployeeDirectory().createEmployee("vetadmin");
        vetClinic.getUserAccountDirectory().createUserAccount("vetadmin", "vetadmin", clinicAdmin, new EnterpriseAdminRole());

        // Add default Doctor organization
        Organization doctorOrg = vetClinic.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        Employee vetDoc = doctorOrg.getEmployeeDirectory().createEmployee("Dr. GoodBoy");
        doctorOrg.getUserAccountDirectory().createUserAccount("vetdoc", "vetdoc", vetDoc, new petCare.Role.VeterinarianRole());

        return system;
    }
}
