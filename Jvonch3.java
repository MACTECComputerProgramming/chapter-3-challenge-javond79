
package jvonch3;

import javax.swing.JOptionPane;


public class Jvonch3 {

 
    public static void main(String[] args) {

    String input = JOptionPane.showInputDialog("Please enter your first name")
        
    System.out.println(input);
        
   
    String input2 = JOptionPane.showInputDialog("Please enter your last name")
        
                
                
    System.out.println(input2);
        
        
    String spot3 = JOptionPane.showInputDialog("Please enter your age")

        
                    
    int op21 = Integer.parseInt (spot3); 
        
            
            
    System.out.println();
        
           
    System.out.print("  "+input+" "+input2+" Birth year is: " + (2021 - op21 ) );    
           
           
            
        
        
    }
    
}