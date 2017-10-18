/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class FoodWorkQueue {
    private ArrayList<FoodWorkRequest> foodWorkRequestList;

    public FoodWorkQueue() {
        foodWorkRequestList = new ArrayList();
    }

    public ArrayList<FoodWorkRequest> getFoodWorkRequestList() {
        return foodWorkRequestList;
    }

    
}
