package petCare.Enterprise;

import petCare.Organization.Organization;
import petCare.Organization.Organization.Type;
import petCare.Order.OrderDirectory;
import petCare.Role.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PetRetailEnterprise extends Enterprise {

    private OrderDirectory orderDirectory;
    private HashMap<String, Double> menu;

    public PetRetailEnterprise(String name, int zip, String address) {
        super(name, EnterpriseType.PetRetail, zip, address);
        orderDirectory = new OrderDirectory();
        menu = new HashMap<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Type> getAllOrganizationTypes() {
        List<Type> orgTypes = new ArrayList<>();
        orgTypes.add(Type.Transport);
        orgTypes.add(Type.Manager);
        return orgTypes;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public HashMap<String, Double> getMenu() {
        return menu;
    }
}
