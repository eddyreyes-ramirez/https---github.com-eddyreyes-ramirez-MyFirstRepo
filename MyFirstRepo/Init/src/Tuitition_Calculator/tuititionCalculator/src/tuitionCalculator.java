

public class tuitionCalculator {
    public static void main(String[] args) throws Exception {
        //Constant variables- TUITION_YEAR_ONE & ANNUAL_RATE 
        final double TUITION_YEAR_ONE = 10000;
        final double ANNUAL_RATE = .05;

        //tuitionYearTen – holds amount after ten years from formula
        //calculating annual interest
        //Amount = [initial value(which is 10,000) * (1+ interest rate) ^(to the power of the amount of years(we want to know after 10 years))]
        //totalCost = total cost of four years' worth of tuition after the tenth year, currently set to zero.
        //Tuition = tuitonYearTen

        double tuitionYearTen = TUITION_YEAR_ONE * Math.pow(1+ANNUAL_RATE, 10); 
        double totalCost = 0;
        double tuition = tuitionYearTen;

        
	    //Decision : calculates the 4 years after the ten year tuition amount:
        //For year 1 -4 , gets the growth rate ( 1+ .05)* tuition( which is really the tuition after ten years)  
        //and then stores the result as new tuition value
        //totalCost = total cost + tuition value
        //continues until year = 4
        
        for (int year = 1; year <=4; year++ ) {
            tuition  *= (1 + ANNUAL_RATE);
            totalCost += tuition;

        }
        //Print tuition after 10 years formatted so it has a dollar sign, comma
        System.out.printf("The price of tutition after 10 years is $%,.2f\n", +  tuitionYearTen); 
        System.out.printf(". The total cost of four years' worth of tuition after the tenth year is $%,.2f\n", totalCost);


    }
}
