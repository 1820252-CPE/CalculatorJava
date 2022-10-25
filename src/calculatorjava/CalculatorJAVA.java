/*
Created by: Charles Dominique A. Bacanto
Description: Creating a simple calculator program in Java using JOptionPane 
*/

package calculatorjava;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class CalculatorJAVA {

public static void main(String args[]) {
            
        
		String choice;   
                Scanner scanner = new Scanner(System.in);
                while (true){
		choice = JOptionPane.showInputDialog("""
                                                   Please enter the corresponding symbol or character for the operation you want to execute:
                                                    '+' for Addidtion 
                                                    '-' for Subtraction 
                                                    '*' for Multiplication 
                                                    '/' for Division 
                                                    's' for Square Root
                                                    'e' to Exit
                                                     """);
                     
                try{
                    switch (choice) {
                        case "+":
                             
                              String add_value1 = 
                              JOptionPane.showInputDialog("Please enter the value of the first addend");      
                              String add_value2 =
                              JOptionPane.showInputDialog("Please enter the value of the second addend");
                              
                              int addend1 = Integer.parseInt(add_value1);
                              int addend2 = Integer.parseInt(add_value2);
                              int sum = addend1 + addend2;
                              
                              JOptionPane.showMessageDialog(null, "The sum of the entered first and second addend is equal to : " + sum, 
                         "Addition", JOptionPane.PLAIN_MESSAGE);
                                break;
                             
                        case "-":
                              String subvalue1 = 
                              JOptionPane.showInputDialog("Please enter the value of the minuend");
                              String subvalue2 =
                              JOptionPane.showInputDialog("Please enter the value of the subtrahend");

                              int minuend = Integer.parseInt(subvalue1);
                              int subtrahend = Integer.parseInt(subvalue2);
                              int difference = minuend - subtrahend;

                              JOptionPane.showMessageDialog(null, "The difference of the entered minuend and subtrahend is equal to: " + difference,
                         "Subtraction", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                        case "*":
                              String mul_value1 =
                              JOptionPane.showInputDialog("Please enter the value of the first factor");
                              String mul_value2 =
                              JOptionPane.showInputDialog("Please enter the value of the second factor");

                              int factor1 = Integer.parseInt(mul_value1);
                              int factor2 = Integer.parseInt(mul_value2);
                              int product = factor1 * factor2;

                              JOptionPane.showMessageDialog(null, "The product of the entered first and second factor is equal to: " + product,
                         "Multiplication", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                         case "/":
                              String div_value1 =
                              JOptionPane.showInputDialog("Please enter the value of the dividend");
                              String div_value2 =
                              JOptionPane.showInputDialog("Please enter the value of the divisor");

                              int dividend = Integer.parseInt(div_value1);
                              int divisor = Integer.parseInt(div_value2);
                              int quotient = dividend / divisor;
                              JOptionPane.showMessageDialog(null, "The quotient of the entered dividend and divisor is equal to: " + quotient,
                         "Division", JOptionPane.PLAIN_MESSAGE);         
                              break;
                             
                         case "s":   
                             String squareroot =
                             JOptionPane.showInputDialog("Please enter the value of the number you want to get the square root");
                             
                              int  roots = Integer.parseInt(squareroot);                             
                              JOptionPane.showMessageDialog(null, "The square root of the entered value is equal to: "+ Math.sqrt(roots),
                         "Square Root", JOptionPane.PLAIN_MESSAGE); 
                              break;
                              
                        case "e":
                                JOptionPane.showMessageDialog(null,"Program running time will be ending...");
                                System.exit(0);
                                break;
                        default:
                           JOptionPane.showMessageDialog(null,"The value you entered is not valid");
                           break;
                    }
       
                }catch (NumberFormatException el){
                    JOptionPane.showMessageDialog(null,"The entered input are not valid please try again");
                   }
            }
        
    }
}