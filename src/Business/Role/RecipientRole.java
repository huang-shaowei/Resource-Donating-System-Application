/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.RecipientOrganization;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
import Business.Validations.CheckUserName;
import javax.swing.JPanel;
import userinterface.Recipient.RecipientWorkAreaJPanel;

/**
 *
 * @author karth
 */
public class RecipientRole extends Role {

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
        return new RecipientWorkAreaJPanel(userProcessContainer, account, (RecipientOrganization) organization, 
                enterprise, ecoSystem);
    }

  
    
}
