package Business.Validations;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author karth
 */
public class ValidateValuesInput extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int i=Integer.parseInt(text);
                
                if(i<=0)
                {
                    
                    JOptionPane.showMessageDialog(input, "Please enter positive values", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(input, "Please enter only Numbers", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        else {
            
            return true;
        }
    }
    
    public boolean validate(JComponent input) {
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
