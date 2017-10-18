/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Network.Network;



/**
 *
 * @author User
 */
public class FoodWorkRequest extends WorkRequest{
    
    private String approval;
    private String foodName;
    private Network network;  

    private String foodType;
    

    public String getApproval() {
        return approval;
    }

    public void setApproval(String testResult) {
        this.approval = approval;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

 
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    

    
    
    
    @Override
    public String toString() {
        return foodName;
    
    }
    
}
