package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Validations.CheckUserName;
import Business.UserAccount.UserAccount;
import Business.Validations.CheckOrganizationName;
import javax.swing.JPanel;

/**
 *
 * @author Trupti
 */
public abstract class Role 
{
    public enum RoleType{
        HOSPADMIN("Hospital Admin"),
        DOCTOR("Doctor"),
        NURSE("Nurse"),
        Hospital("Hospital"),
        HOUSEOWNER("House Owner"),
        NETWORKADMIN("Network Admin"),
        SYSADMIN("System Admin"),
        PATIENT("Patient"),
        SUPERMARKET("Supermarket"),
        RECIPIENT("Recipient"),
        FOOD("Food");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
                                        UserAccount account, 
                                        Organization organization, 
                                        Enterprise enterprise, 
                                        Network network,
                                        EcoSystem ecoSystem,
                                        CheckOrganizationName checkOrgName,
                                        CheckUserName checkUserName);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
