/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptioninteger;

import javax.swing.JOptionPane;

public class JOptionInteger {

    public static void main(String[] args) {
        //Prompt the user for input
        String input1 = JOptionPane.showInputDialog("Enter Your First integer");
        String input2 = JOptionPane.showInputDialog("Enter Your Second integer");
        
        //convert input Strings into integers
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
       
        //Calculate the sum
        int sum = num1 + num2;
        
        //Displaying the result
        JOptionPane.showMessageDialog(null,"The Sum of: "+num1+" and: "+num2+" is: "+sum);
        
        
        
        
    }
}
