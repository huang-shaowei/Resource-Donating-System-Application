/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupermarketEnterprise;
import Business.Network.Network;
import Business.Organization.SupermarketOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
import Business.Validations.CheckUserName;
import javax.swing.JPanel;
import userinterface.Supermarket.SupermarketWorkAreaJPanel;

/**
 *
 * @author karth
 */
public class SupermarketRole extends Role{

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
        return new SupermarketWorkAreaJPanel(userProcessContainer, account, (SupermarketOrganization) organization, 
                enterprise, ecoSystem);
    }

    
    
    
}
