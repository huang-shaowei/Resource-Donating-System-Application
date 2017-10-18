/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RecipientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class RecipientOrganization extends Organization {
     public RecipientOrganization() {
        super(Organization.Type.Recipient.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RecipientRole());
        return roles;
    }
}
