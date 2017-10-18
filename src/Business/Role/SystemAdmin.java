package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Validations.CheckUserName;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
;
import java.util.ArrayList;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author User
 */
public class SystemAdmin extends Role
{

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
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecoSystem);
    }


    
}
