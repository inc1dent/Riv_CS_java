
//Write code for a two operand equation.  Print result.

import java.util.Scanner;
import java.io.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Equation_Solver
{
    public static void main ()
    {
        String operand1, operand2; //declare the string which will hold the operands
        double int1, int2, int3, int4=0, int5=0; //declare the integers which will hold the math
        String equation; //declare string which holds entire equation
        String answer; // if the user wants to enter another equation
        
        NumberFormat nf = new DecimalFormat("##.##"); //formats the answer
        
        System.out.println("\t***********Welcome to the Calculator!***********"); //welcome user

        do{

            System.out.println("\n\tEnter a mathematical operation with two operands:\n"); //prompt user

            Scanner scan = new Scanner (System.in); //initialize new scanner
            equation=scan.nextLine(); //holds entire equation

            Scanner operation = new Scanner (equation); /*
                                                        initialize a new scanner that 
                                                        scans equation for the individual integers and operands
                                                        */                                                        
            operation.useDelimiter("\\s*"); //set the delimiter
            
            //scan each part of the equation and assign it to an integer or string.   
            int1 = operation.nextDouble(); 
            operand1 = operation.next();
            int2 = operation.nextDouble();
            operand2 = operation.next();
            int3 = operation.nextDouble();

            System.out.println("\nYour Equation: " + equation); //print's user's equation
            
            //create the outermost if statements that take care of order of operations
            if (operand1.charAt(0)==45 || operand1.charAt(0)==43) 
            //if the first operand is addition or subtraction, start with operand2.
            {   
 
                if (operand2.charAt(0)==47) //if statements that check operand2 and
                    int4=int2/int3;         //perform the appropriate operation
                if (operand2.charAt(0)==42)
                    int4=int2*int3;
                if (operand2.charAt(0)==43)
                    int4=int2+int3;
                if (operand2.charAt(0)==45)
                    int4=int2-int3;

                if (operand1.charAt(0)==47) //if statements that check operand1
                    int5=int1/int4;
                if (operand1.charAt(0)==42)
                    int5=int1*int4;
                if (operand1.charAt(0)==43)
                    int5=int1+int4;
                if (operand1.charAt(0)==45)
                    int5=int1-int4;

            }

            if (operand1.charAt(0)==42 || operand1.charAt(0)==47)
            //if first operand is multiplication or division, start with operand1.
            {
                
                if (operand1.charAt(0)==47)  //if statements that check operand1 and 
                    int4=int1/int2;          //perform the appropriate operation.   
                if (operand1.charAt(0)==42)
                    int4=int1*int2;
                if (operand1.charAt(0)==43)
                    int4=int1+int2;
                if (operand1.charAt(0)==45)
                    int4=int1-int2;

                if (operand2.charAt(0)==47) //if statements that check operand2
                    int5=int4/int3;
                if (operand2.charAt(0)==42)
                    int5=int4*int3;
                if (operand2.charAt(0)==43)
                    int5=int4+int3;
                if (operand2.charAt(0)==45)
                    int5=int4-int3;

            }
            //Print results.
            System.out.println("\nThe answer is: " + nf.format(int5));
            
            System.out.println("\nWould you like to enter another equation? (y/n) ");
            answer = scan.next();
            
        } while (answer.equalsIgnoreCase("y"));       
    }
}

