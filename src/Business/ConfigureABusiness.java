/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;


/**
 *
 * @author karth
 */
public class ConfigureABusiness {
    
    public static EcoSystem configure(){
      EcoSystem ecosys = EcoSystem.getInstance();
 
        Employee employee = ecosys.getEmployeeDirectory().createEmployee("kart");//here you can give default value to play arount with
        UserAccount ua = ecosys.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdmin());//here you can give default value to play arount with
        
        return ecosys;
}
}