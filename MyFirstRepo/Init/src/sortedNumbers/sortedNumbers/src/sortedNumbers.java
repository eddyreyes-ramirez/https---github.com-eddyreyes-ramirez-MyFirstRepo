import java.util.*;

public class sortedNumbers {
    public static void main(String[] args) throws Exception {
        //open scanner for user input
        Scanner in = new Scanner(System.in);
        //Create and initialize array of type double named listOfnumbers, will hold 3 values
        double [] listOfNumbers = new double [3]; 
        //ask user to enter 3 numbers. User will press enter after each input
        System.out.print("Enter three numbers. Press enter after every number.\n");
        //for loop, variable i = 0, adds user input directly into array, listOfNumbers, 
        //until I is no longer less than the length of array (3) 
        for (int i =0; i < listOfNumbers.length; i++){
        listOfNumbers[i] = in.nextDouble();   
        }
        //Call method displaySortedNumbers
        displaySortedNumbers(listOfNumbers);
        //Closes scanner.
        in.close();
    }
    //method sorts values in array in increasing order and prints back to user 
   public static void displaySortedNumbers(double [] numbers){
        //Sorts values in array in increasing order
        Arrays.sort(numbers);
        System.out.println("Your numbers in increasing order are: ");
        // Print every value in array(already sorted) using foreach loop
        for (double num : numbers){
            System.out.print(num + ", ");
        }
    }
}
