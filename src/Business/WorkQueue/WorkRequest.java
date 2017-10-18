/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author User
 */
public abstract class WorkRequest {
    
    private String message;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    private UserAccount requestorName;
    private UserAccount approverName;
    private String category;
    private String details;
    private String status;
    private String type;
    private int quantity;
    private Date requestDate;
    private Date resolveDate;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    private MedicalCampWorkRequest medicalCampWorkRequest;

    public MedicalCampWorkRequest getMedicalCampWorkRequest() {
        return medicalCampWorkRequest;
    }

    public void setMedicalCampWorkRequest(MedicalCampWorkRequest medicalCampWorkRequest) {
        this.medicalCampWorkRequest = medicalCampWorkRequest;
    }
    
     public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 

    public UserAccount getRequestorName() {
        return requestorName;
    }

    public void setRequestorName(UserAccount requestorName) {
        this.requestorName = requestorName;
    }

    public UserAccount getApproverName() {
        return approverName;
    }

    public void setApproverName(UserAccount approverName) {
        this.approverName = approverName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
