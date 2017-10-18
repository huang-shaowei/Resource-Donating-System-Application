/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.CommunityCenterOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
import Business.Validations.CheckUserName;

import javax.swing.JPanel;
import userinterface.Hospital.HospitalWorkAreaJPanel;

/**
 *
 * @author Trupti
 */
public class HospitalAdminRole extends Role{

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
        
        return new HospitalWorkAreaJPanel(userProcessContainer,account,(HospitalOrganization)organization, enterprise, ecoSystem);
    
    }
    
}
