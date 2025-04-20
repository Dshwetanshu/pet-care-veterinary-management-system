/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.Enterprise;

import petCare.Order.OrderDirectory;
import petCare.Organization.Organization;
import petCare.Patient.PatientDirectory;
import petCare.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeelpatel
 */
public class HealthCenterEnterprise extends Enterprise {

    private PatientDirectory patientDirectory;
    private OrderDirectory orderDirectory;

    public HealthCenterEnterprise(String name, int zip, String address) {
        super(name, EnterpriseType.HealthCenter, zip,address);
        patientDirectory = new PatientDirectory();
        orderDirectory = new OrderDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Doctor);
        orgTypes.add(Organization.Type.Lab);
        //orgTypes.add(Organization.Type.Patient);
        orgTypes.add(Organization.Type.Accountant);

        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

}
