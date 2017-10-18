/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author karth
 */
public abstract class Enterprise extends Organization{//read why we put it abstract class? and come up with answers
    //error on line 14 cuz we either need to implement all abstract methods (from parent class) or make this class as abstract
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    
    public Enterprise(String name,EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType=enterpriseType;
        organizationDirectory=new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        
        CommunityCenter("Community Center"),
        Hospital("Hospital"),
        Supermarket("Supermarket"),
        Corporate("Corporate");
        
        
        
        private String value;

        
        private EnterpriseType(String value){//we added this constructor cuz there was error in line 20: Hospital("Hospital");
            this.value=value;
        }
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
       public String toString(){
           return value;
       } 
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
}
