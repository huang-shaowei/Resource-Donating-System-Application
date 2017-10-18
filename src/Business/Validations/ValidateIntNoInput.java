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
public class ValidateIntNoInput extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int i=Integer.parseInt(text);
                
                if(i<=0)
                {
                    
                    JOptionPane.showMessageDialog(input, "Please enter positive Numbers", "Error", JOptionPane.ERROR_MESSAGE);
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
    
}
