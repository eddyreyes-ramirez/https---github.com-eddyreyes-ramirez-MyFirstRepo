
import java.util.*;
public class bodyMassIndexFormula {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // ask user for weight in pounds
        System.out.println("Enter weight in pounds.");
        //receive weight in pounds, variable type double
        double weightInPounds = input.nextDouble();
        //ask user for height in feet
        System.out.println("Enter hieght, feet only.");
        //store input in variable type double
        double heightInFeet = input.nextDouble();
        //ask user for height in inches
        System.out.println("Enter height, in inches.");
        //store input in variable type double
        double heightInInches = input.nextDouble();
        // constants, conversions for kilos to pounds & meters per inch
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        //compute BMI
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        //12 inches to 1ft calculated first, then added to height in inches
        // sum multiplied by Kilo conversion 
        double heightInMeters = ((heightInFeet *12) + heightInInches) * METERS_PER_INCH ;
        double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters );

        //print statement
        System.out.println("BMI is " + bodyMassIndex );
        // decision if bmi is less than 18.5  is true, then add Underweight to print statement
        if (bodyMassIndex < 18.5)
            System.out.println("Underweight"); 
        // decision else if bmi is less than 25 is true and condition before is false; then add Normal to print statement
        else if (bodyMassIndex < 25)
        System.out.println("Normal");
        // decision else if bmi is less than 30 is true and conditions before are false; then add Overweight to print statement
        else if (bodyMassIndex < 30)
        System.out.println("Overweight");
        // decision else when all conditions before are false; then add obese to print statement
        else 
        System.out.println("Obese");        
    }
}
