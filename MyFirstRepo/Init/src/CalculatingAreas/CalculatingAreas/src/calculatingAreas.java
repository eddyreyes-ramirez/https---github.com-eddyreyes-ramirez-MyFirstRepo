import java.util.Scanner;

public class calculatingAreas {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        // ask user to enter the side length
        System.out.println("Enter the length of one side of the hexagon.");
        // store user input as variable sideOfHexagon, of type double
        double sideOfHexagon = input.nextDouble();
        // formula for Area of Hexagon
        // 3 * (squareroot of 3)* (sideOfHexagon squared) all divided by two
        final double AreaOfHexagon = ((3 * Math.sqrt(3) * Math.pow(sideOfHexagon,2) / 2));
        // print area of Hexagon( formatted to have two decimal places)
        System.out.printf("The area of the Hexagon is %4.2f", AreaOfHexagon);
    }
}
