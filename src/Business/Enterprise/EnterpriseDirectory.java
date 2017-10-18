/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory(){
        
        enterpriseList=new ArrayList<Enterprise>();
    }
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
    //same thing here is done in OrganizationDirectory class
    Enterprise enterprise=null;    
        if(type==Enterprise.EnterpriseType.CommunityCenter){
            enterprise= new CommunityCenterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Hospital){
            enterprise= new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Supermarket){
            enterprise= new SupermarketEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
            
    return enterprise;
    }
    
}
