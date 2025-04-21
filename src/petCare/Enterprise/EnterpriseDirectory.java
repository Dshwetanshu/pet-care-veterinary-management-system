/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Enterprise;

/**
 *
 * @author DWIJ
 */

import java.util.ArrayList;

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, int zip, String address) {
        Enterprise enterprise = null;

        switch (type) {
            case VeterinaryClinic:
                enterprise = new VeterinaryClinicEnterprise(name, zip, address);
                break;
            case PetInsurance:
                enterprise = new PetInsuranceEnterprise(name, zip, address);
                break;
            case PetRetail:
                enterprise = new PetRetailEnterprise(name, zip, address);
                break;
        }

        if (enterprise != null) {
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }
}
