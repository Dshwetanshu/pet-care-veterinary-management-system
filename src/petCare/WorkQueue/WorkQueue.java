/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petCare.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author sid
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequests;
    }
}