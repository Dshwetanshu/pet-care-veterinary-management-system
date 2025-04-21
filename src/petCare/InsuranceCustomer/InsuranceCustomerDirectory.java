/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.InsuranceCustomer;

/**
 *
 * @author DWIJ
 */


import java.util.ArrayList;
import java.util.List;

public class InsuranceCustomerDirectory {
    private List<InsuranceCustomer> insuranceCustomerList;

    public InsuranceCustomerDirectory() {
        insuranceCustomerList = new ArrayList<>();
    }

    public List<InsuranceCustomer> getInsuranceCustomerList() {
        return insuranceCustomerList;
    }

    public InsuranceCustomer addCustomer(String name, String ssn, String phone, String email) {
        InsuranceCustomer customer = new InsuranceCustomer();
        customer.setName(name);
        customer.setSsn(ssn);
        customer.setPhone(phone);
        customer.setEmail(email);
        insuranceCustomerList.add(customer);
        return customer;
    }

    public void removeCustomer(InsuranceCustomer customer) {
        insuranceCustomerList.remove(customer);
    }
}