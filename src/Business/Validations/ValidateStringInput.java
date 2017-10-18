/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validations;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author karth
 */
public class ValidateStringInput extends InputVerifier {
    
    @Override
        public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        String pattern = "^[a-zA-Z0-9]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                
                JOptionPane.showMessageDialog(input, "No Special Charaters Allowed, Please Enter valid characters", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                
                return true;
            }
        }
        else if (text.length() == 0)
        {
            JOptionPane.showMessageDialog(input, "Field Should not be blank,Please enter the values", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
        {
            
            return true;
        }
    }
}
