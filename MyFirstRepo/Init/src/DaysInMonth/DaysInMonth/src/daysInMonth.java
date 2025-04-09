import java.util.*;
public class daysInMonth {
    public static void main(String[] args)  {
        Scanner input = new Scanner (System.in);
        //declaring array and array variable of type string
        // list of months
        String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //ask user to input year
        System.out.println("Enter a year.");
        // next user input will be assigned variable year
        int year = input.nextInt();
        //boolean expression, (If True)  And (False) Or True
        //boolean expresision determines if the remainder of year / 4 is equal to zero 
        //AND year divided by 100 does not equal zero
        // OR year divided by 400 equals 0 
        //then year is leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
        //ask user to input month
        System.out.println("Enter month.");
        //next user input will be assigned to variable month
        int month = input.nextInt();
        //initializing variable days, assigning variable zero
        int days = 0;
        //switch statement
        switch (month) {
            // grouping months that have the same days
            // months 1,3,5,7,8,10,12 all have 31 days, variable assigned to days will be the same
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31;
                break;
                // for month February, checking if boolean expression (if year is leap year)
            case 2: if (isLeapYear)
                    // if true then days will be assigned 29
                    days = 29;
                    //if false, not a leap year. days will be assigned 28
                    else days = 28;
                break;
            // for months 4, 6, 9, 11, all have 30 days
            case 4:
            case 6:
            case 9:
            case 11: days = 30;
                break;
            // if user inputs a number other than 1-12, will recieve error message
            // exiting switch statement
            default:System.out.println("Error: invalid month");
            System.exit(1);     
        } 
        // print the number of days in the month, in the year based on user input.
        // call array monthsOfYear to get name of month selected, subtract 1 from array becuase array starts at 0,
        // call number of days from switch statement 

        System.out.println(monthsOfYear[month-1] + " had " + days + " days in " + year + ".");
        
    }
}
