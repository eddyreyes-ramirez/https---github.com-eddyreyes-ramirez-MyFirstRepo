//import java.util class
import java.util.*;

public class gratuityCalculator {
    public static void main(String[] args)  {
        //create scanner for user input 
        Scanner input = new Scanner(System.in);
        //ask user to input subtotal amount, will assign input as variable of data type double
        System.out.println("Enter the subtotal Amount:..Ex 1.00. ");
        double subTotalAmount = input.nextDouble();
        
        //while loop, while subTotalAmount does not equal zero, the following will proceed.
        while (subTotalAmount != 0) {
            //ask user to input the desired grauity rate as a percentage.
            // Will accept  next user input as variable of data type double.
            System.out.println("Enter your desired gratuity rate as a percentage. Ex. 10 = 10%");
            double gratuityRate = input.nextDouble(); 
            // using formula and assigning result to variable gratuity of data type double
            double gratuity = subTotalAmount * (gratuityRate/100);
            //using formula and assigning result to variable finalAmount of data type double
            double finalAmount = subTotalAmount + gratuity; 
            //print the results of the computation and ask user to enter another subTotalAmount. 
            //Stores next user input as variable subTotalAmount and continues loop.
            // if user presses zero, program will end 
            System.out.println("Gratuity = $" + gratuity + "\nTotal = $" + finalAmount);
            System.out.println("\nEnter the subtotal Amount:..Ex 1.00. Enter 0 to finish");
            subTotalAmount = input.nextDouble();
        }
        System.out.println("You have selected to finish.");   
        //Prints end of program and closes user input. 
        input.close();      
    }
}
