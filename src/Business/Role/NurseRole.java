package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Network.Network;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Validations.CheckUserName;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;

import javax.swing.JPanel;
import userinterface.Nurse.NurseWorkArea;

/**
 *
 * @author Trupti
 */
public class NurseRole extends Role {


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
        return new NurseWorkArea(userProcessContainer, (NurseOrganization) organization, 
                enterprise, network, account);
    }

}
