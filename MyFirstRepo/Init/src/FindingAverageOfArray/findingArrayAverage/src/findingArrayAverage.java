import java.util.*;
public class findingArrayAverage {
    public static void main(String[] args) throws Exception {
        //open scanner for user input
        Scanner in = new Scanner(System.in);
        //create array, of type double, will hold 10 values
        double [] value = new double [10];
        // ask user to enter 10 values.
        System.out.print("Enter ten double values. Press enter after every value.\n");
       
        //for loop, variable i = 0, adds user input directly into array, value, 
        //until i is no longer less than the length of array (10) 
        for (int i =0; i < value.length; i++){
            value[i] = in.nextDouble();    
            }
           // displayAverage, invoke method average and get value;
            System.out.println("The average of your values is " + average(value));
            //close scanner
           in.close();
    }
    
    // method average of type int
    public static int average(int[] array) {
        int sum= 0;
        for (int value : array)
        //for each value inside array, add to variable sum, 
        //continues loop until finshed      
        sum += value;
        //when method average is called
        // returns the sum of all numbers % the length of the array, which is 10.
        return sum/array.length;   
    }

    // method average of type double, will return the average of the array 
    public static double average(double [] array){
    double sum = 0.0;
    //for each value inside array, add to variable sum, 
    //continues loop until finshed 
    for(double value : array)
    sum += value;
    // returns the average - the sum of all numbers % the length of the array, which is 10.
    return sum/array.length;
    }
}