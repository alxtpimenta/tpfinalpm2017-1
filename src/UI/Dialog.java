/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class Dialog {
    
    public static String stringInput(String dialog)
    {
        return JOptionPane.showInputDialog(dialog);
    }
    
    public static int intInput(String dialog)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(dialog));
    }
}
