/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validations;

import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class CheckOrganizationName {

    private ArrayList<String> orgNames;
    
    public CheckOrganizationName()
    {   
        orgNames = new ArrayList<>();    
    }
    
    public ArrayList<String> getOrgNames() {
        return orgNames;
    }

    public void setOrgNames(ArrayList<String> orgNames) {
        this.orgNames = orgNames;
    }
    

    public void createOrgName(String orgName)
    {
        orgNames.add(orgName);
    }
    
    
    public boolean checkOrgName(String checkOrgName)
    {
        for (String orgName : orgNames) {
            if (orgName.equals(checkOrgName)) {
                return false;
            }
        }
        return true;
    }
    
}
