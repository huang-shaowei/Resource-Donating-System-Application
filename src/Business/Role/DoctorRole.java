package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Validations.CheckUserName;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
import userinterface.Doctor.DoctorWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Trupti
 */
public class DoctorRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
                                        UserAccount account, 
                                        Organization organization, 
                                        Enterprise enterprise, 
                                        Network network,
                                        EcoSystem ecoSystem,
                                        CheckOrganizationName checkOrgName,
                                        CheckUserName checkUserName) {
        return new DoctorWorkAreaJPanel(userProcessContainer,(DoctorOrganization)organization, 
                network,account,enterprise);
    }
    
}
