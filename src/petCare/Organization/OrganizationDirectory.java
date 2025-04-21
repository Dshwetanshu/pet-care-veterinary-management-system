/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Organization;

/**
 *
 * @author DWIJ
 */

import java.util.ArrayList;

public class OrganizationDirectory {
    private ArrayList<Organization> organizations;

    public OrganizationDirectory() {
        organizations = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizations;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization org = null;
        switch (type) {
            case Admin:
                org = new AdminOrganization(); break;
            case Accountant:
                org = new AccountantOrganization(); break;
            case Manager:
                org = new ManagerOrganization(); break;
            case Transport:
                org = new TransportOrganization(); break;
            case Veterinarian:
                org = new VeterinarianOrganization(); break;
            case Lab:
                org = new LabOrganization(); break;
            case InsuranceAgent:
                org = new InsuranceAgentOrganization(); break;
            case InsurancePolicyPlanner:
                org = new InsurancePolicyPlannerOrganization(); break;
            case InsuranceFinanceOrganization:
                org = new InsuranceFinanceOrganization(); break;
            case HealthcareOfficer:
                org = new HealthcareOfficerOrganization(); break;
            case Secretary:
                org = new SecretaryOrganization(); break;
            case Treasurer:
                org = new TreasurerOrganization(); break;
        }
        if (org != null) organizations.add(org);
        return org;
    }
}
