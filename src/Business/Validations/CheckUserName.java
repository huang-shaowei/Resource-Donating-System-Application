package Business.Validations;

import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class CheckUserName {
    
    private ArrayList<String> userNames;
    
    public CheckUserName()
    {
        userNames = new ArrayList<>();
    }
    
    public ArrayList<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(ArrayList<String> userNames) {
        this.userNames = userNames;
    }
  
    public void createUserName(String userName)
    {
        userNames.add(userName);
    }
    
    public boolean checkUserName(String checkUserName)
    {
        for (String userName : userNames) {
            if (userName.equals(checkUserName)) {
                return false;
            }
        }
        return true;
    }
    
}
