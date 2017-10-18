/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.CommunityCenterEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
import Business.Validations.CheckUserName;
import javax.swing.JPanel;
import userinterface.CommunityCenter.FoodWorkAreaJPanel;

/**
 *
 * @author User
 */
public class FoodRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, 
                                        UserAccount account, 
                                        Organization organization, 
                                        Enterprise enterprise, 
                                        Network network,
                                        EcoSystem ecoSystem,
                                        CheckOrganizationName checkOrgName,
                                        CheckUserName checkUserName) {
        return new FoodWorkAreaJPanel(userProcessContainer, account, (FoodOrganization)organization, 
                enterprise, ecoSystem);
    }
}
