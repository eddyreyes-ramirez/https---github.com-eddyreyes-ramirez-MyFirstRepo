//program will convert Celsius to Fahrenheit
//importing all classes from java.util
import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        // create scanner to allow input by user
        Scanner input = new Scanner(System.in);
        String optionToContinue = "Y";
        while (optionToContinue.equalsIgnoreCase("Y")) {
         System.out.println("Enter the temperature in Celsius." +
         " Ex.24.2.");
        
        

         double celsiusInput = input.nextDouble();
         double TempInFahrenheit = (9.0/5) * celsiusInput + 32;
         
         System.out.print(celsiusInput + " Degrees celsius is " + (String.format("%.2f",TempInFahrenheit)) + " degrees fahrenheit.\n" +
         "Do you want to play again? Press (Y)es pr (N)o to exit\n");
         input.nextLine();
         optionToContinue = input.nextLine();
        }
                
    }
}