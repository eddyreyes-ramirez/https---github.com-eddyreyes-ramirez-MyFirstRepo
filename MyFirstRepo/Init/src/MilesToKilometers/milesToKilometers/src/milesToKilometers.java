public class milesToKilometers {
    public static void main(String[] args) throws Exception {
        //print and format table header: formatted miles to the left, 10 spaces wide
        //formatted Kilometers to the left
        System.out.format("%-10s %-12s\n", "Miles", "Kilometers");
        //variable named miles with 1 assigne to it 
        double miles = 1;
        // while miles less than 11 
        while (miles < 11){
            //Kilometers =  number of miles * conversion
            double kiloMeters = miles * 1.609;
            // print number of miles and kilometer equivalent
            // number of miles formatted to the left, 0 decimal places
            // kilometers formatted to the left with 3 decimal places 
            System.out.format("%-10.0f %-12.3f\n", miles, kiloMeters );
            // after loop has ran and printed, number of miles increased by 1: 
            //until no longer less than 11 
            miles++;
            }  //end of while loop
        }
    }

