/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SupermarketRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SupermarketOrganization extends Organization {
    public SupermarketOrganization() {
        super(Organization.Type.Supermarket.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupermarketRole());
        return roles;
    }
}
