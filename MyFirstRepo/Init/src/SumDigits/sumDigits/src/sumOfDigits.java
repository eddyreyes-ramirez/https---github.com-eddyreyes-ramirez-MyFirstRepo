import java.util.*;
public class sumOfDigits {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //ask user to input number and store number as variable number
        System.out.print("Enter a number.\n");
        long number = in.nextLong();
        // print the sum of the number user entered, (call method sumDigits and get number)
        System.out.println("The sum of the digits is " + sumDigits(number));
        // close scanner
        in.close();  
    }

    // method named sumDigits
    public static int sumDigits(long n ){
        
        //variable number gets the absolute value of the input and converts to number to type int
        int number = (int)Math.abs(n);
        //iniializing variable sum that will hold sum value
        int sum = 0;
        //loop to calculate the sum of digits, 
        //while number is not 0, % 10 gets the last digit of the number 
        while (number !=0) {
            //% 10 gets the last digit of the number and then adds the number to variable sum
            sum+= (number % 10);
            //number /10 removes the last digit of the number and then continues loop again until number = 0
            number = number/10;
        }
        // once all numbers have been added returns variable sum
        return sum;
          
    }
    
}
