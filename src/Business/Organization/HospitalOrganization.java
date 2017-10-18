package Business.Organization;

import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class HospitalOrganization extends Organization
{
    public HospitalOrganization() 
    {
        super(Organization.Type.Hospital.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalAdminRole());
        return roles;
    }   
}
