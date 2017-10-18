/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
import Business.Validations.CheckUserName;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Trupti
 */
public class AdminRole extends Role{

    //here we're assigning the screen according to their Role
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
                                        UserAccount account, 
                                        Organization organization, 
                                        Enterprise enterprise, 
                                        Network network,
                                        EcoSystem ecoSystem,
                                        CheckOrganizationName checkOrgName,
                                        CheckUserName checkUserName) 
    {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
