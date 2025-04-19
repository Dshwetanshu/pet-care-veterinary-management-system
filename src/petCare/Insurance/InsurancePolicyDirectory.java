/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petCare.Insurance;

/**
 *
 * @author DWIJ
 */

import java.util.ArrayList;
import java.util.List;

public class InsurancePolicyDirectory {

    private List<Insurance> policies = new ArrayList<>();

    public List<Insurance> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Insurance> policies) {
        this.policies = policies;
    }

    public Insurance addPolicy(String name, String company, double coverage, double premium, String terms) {
        Insurance policy = new Insurance(name, company, coverage);
        policy.setMonthlyPremium(premium);
        policy.setPolicyTC(terms);
        policies.add(policy);
        return policy;
    }
}
