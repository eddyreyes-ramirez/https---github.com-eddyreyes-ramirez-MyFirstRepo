//program will convert Celsius to Fahrenheit
//importing all classes from java.util
import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        // create scanner to allow input by user
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Celsius." +
        "Ex.24.2");

        double CelsiusInput = input.nextDouble();
        double TempInFahrenheit = (9.0/5) * CelsiusInput + 32;
        System.out.println(celsiusInput + " Degrees celsius is" + 
        TempInFahrenheit + "degrees fahrenheit.");
        
        
    }
}
