//program will convert Celsius to Fahrenheit
//importing all classes from java.util
import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        // create scanner to allow input by user
        Scanner input = new Scanner(System.in);
        // creating sentinel value to give program a way to exit
        String optionToContinue = "Y";
        
        // while user presses y, or Y, will continue to use program

        while (optionToContinue.equalsIgnoreCase("Y")) {
            // asks user to enter temperature in Celsius
            System.out.println("Enter the temperature in Celsius." +
             " Ex.24.2.");
            // variable of type double, will be assigned to the user's next input   
            double celsiusInput = input.nextDouble();
            //variable of type double, formula for conversion using the user's celsius input
            double TempInFahrenheit = (9.0/5) * celsiusInput + 32;
            //print final conversion statement and asks user if they wish to continue using sentinel value as a way to end
            System.out.print(celsiusInput + " degrees celsius is " + (String.format("%.2f",TempInFahrenheit))
             + " degrees fahrenheit.\n" +
             "\nDo you want to play again? Press (Y)es or (N)o to exit\n");
            input.nextLine();
            optionToContinue = input.nextLine();
        }
        //close scanner
    input.close();          
    }
}