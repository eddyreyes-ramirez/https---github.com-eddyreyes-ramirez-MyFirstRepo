import java.util.*;

public class eliminatingDuplicates {
    public static void main(String[] args) throws Exception {
        //open Scanner for user input
        Scanner in = new Scanner(System.in);
        //create array, of type int, will hold 10 values
        int [] values = new int [10];
        //ask user to enter 10 values 
         System.out.print("Enter ten values. Press enter after every value.\n");
         //for loop, variable i = 0, adds user input directly into array, values,
         for (int i =0; i < values.length; i++) { 
            values [i] = in.nextInt();
         }
        // call eminateDuplicates method
         int [] result = eliminateDuplicates(values);
         //print distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int number: result){
                System.out.print(number + " ");
        }
        //close scanner
        in.close();
    }  
       
       // method to remove duplicate numbers from array
        public static int [] eliminateDuplicates(int[] list) {
            //new array that holds disctinct numbers 
           int [] distinctList = new int [list.length];
           //variable count tracks how many disctint numbers there are
           int count= 0;
           //using linear search to the check each number, if number is already in distinctList
           for (int e: list){
                if (linearSearch(distinctList,count, e) == -1){
                    //adds number if not on the list// this is a distinct number
                    distinctList[count] = e;
                    //increases count and runs through loop until finished
                    count++; 
                }
           }
           //copys only distinct values into array named result
           int [] result = new int [count];
           //loop through array from 0 to size -1
           for(int i=0; i<count; i++){
            result [i] = distinctList[i];
           }
           //return array 
           return result;
        }
        // method linear search
        public static int linearSearch(int[]array, int size, int key){
            //loop through array from index 0, 
            //and increase by 1 and loop again until i is no longer less than size - 1)
            for (int i = 0; i < size; i++){
                //if array index = key, return the value of i
                if (array [i] == key){
                    return i;
                }
                
            }
            // if no keys were found return -1
            return -1;
            }
        }

