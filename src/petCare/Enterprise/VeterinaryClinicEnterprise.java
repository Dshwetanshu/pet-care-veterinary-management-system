/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Enterprise;

/**
 *
 * @author DWIJ
 */

import petCare.Organization.Organization;
import petCare.Organization.Organization.Type;
import petCare.Order.OrderDirectory;
import petCare.Pet.PetDirectory;
import petCare.Role.Role;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinicEnterprise extends Enterprise {

    private PetDirectory petDirectory;
    private OrderDirectory orderDirectory;

    public VeterinaryClinicEnterprise(String name, int zip, String address) {
        super(name, EnterpriseType.VeterinaryClinic, zip, address);
        petDirectory = new PetDirectory();
        orderDirectory = new OrderDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Type> getAllOrganizationTypes() {
        List<Type> orgTypes = new ArrayList<>();
        orgTypes.add(Type.Veterinarian);
        orgTypes.add(Type.Lab);
        orgTypes.add(Type.Accountant);
        return orgTypes;
    }

    public PetDirectory getPetDirectory() {
        return petDirectory;
    }

    public void setPetDirectory(PetDirectory petDirectory) {
        this.petDirectory = petDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
}
