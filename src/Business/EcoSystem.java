/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class EcoSystem extends Organization {
   private static EcoSystem business;
        private ArrayList<Network> networkList;
    
    private EcoSystem(){ //Why constructor is private? reason is single10 only 1 object inside your application
        super(null);// calling super class ,which is Organization, and passing null "just to git rid of the error in line 16
        networkList=new ArrayList();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roleList=new ArrayList();
        roleList.add(new SystemAdmin());// the new SystemAdminRole will control the EcoSystem
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }

}
