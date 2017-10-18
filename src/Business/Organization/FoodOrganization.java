/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodRole;
import Business.Role.Role;
import Business.WorkQueue.FoodWorkQueue;
import Business.WorkQueue.FoodWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class FoodOrganization extends Organization {
    
   private FoodWorkQueue foodWorkQueue;

     public FoodOrganization() {
        super(Organization.Type.Food.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodRole());
        return roles;
    }

    
    
    
}
