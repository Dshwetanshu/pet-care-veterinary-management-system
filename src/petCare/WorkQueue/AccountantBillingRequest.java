/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.WorkQueue;

import static petCare.Organization.Organization.Type.Patient;
import petCare.Patient.Patient;
import static petCare.Role.Role.RoleType.Patient;

/**
 *
 * @author sid
 */
public class AccountantBillingRequest extends WorkRequest {

    private double billingAmount;

    private boolean hasInsurance;
    private boolean isInsuranceClaimSettled;
    private PatientVisitWorkRequest visitRequest;
    Patient patient;

    public double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(double billingAmount) {
        this.billingAmount = billingAmount;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public boolean isIsInsuranceClaimSettled() {
        return isInsuranceClaimSettled;
    }

    public void setIsInsuranceClaimSettled(boolean isInsuranceClaimSettled) {
        this.isInsuranceClaimSettled = isInsuranceClaimSettled;
    }

    @Override
    public String toString() {
        return String.valueOf(billingAmount);
    }

    public PatientVisitWorkRequest getVisitRequest() {
        return visitRequest;
    }

    public void setVisitRequest(PatientVisitWorkRequest visitRequest) {
        this.visitRequest = visitRequest;
    }
    
}
