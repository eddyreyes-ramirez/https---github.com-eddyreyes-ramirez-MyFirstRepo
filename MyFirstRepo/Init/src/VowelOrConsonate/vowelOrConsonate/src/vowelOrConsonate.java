import java.util.*;

public class vowelOrConsonate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create array and added vowels in lowercase to array, 
        char[] vowels = {'a','e', 'i', 'o', 'u'};
        //initialize variable letter of type char
        char letter = ' ';
        //Create Boolean condition ( validinput ) = false
        boolean validInput = false;
            //While loop, while not validInput, ask user to enter a letter.
            while (!validInput) {
            System.out.println("Enter a letter:");
            //Accept user input and convert to lowercase,
            String userInput = input.next().toLowerCase();
                //If statement to make sure user input is a letter and of length 1
                if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
                letter = userInput.charAt(0);
                validInput = true;
                //If not true, will print statement for user to enter to try again.
                } else {
                System.out.println("Invalid input. Please enter a single letter.");
            }
        }
        //Boolean type isVowel = false 
       boolean isVowel = false;
       //for loop ; 
       //Variable i assigned 0, when I is less than the length of array vowels( checking user input to vowel list) 
       //check list then add 1 and checks array again.
       for (int i= 0; i< vowels.length; i++) {
        //If letter is in vowel array, is vowel is true. Exit loop
         if (letter == vowels[i]) {
            isVowel= true;
            break;
           }      
        }
        //Print final statement and let user know if the letter they input is a vowel or a consonant. 
        System.out.println("The letter " + letter + (isVowel ? " is a vowel." :
        " is a consonate."));  
        }
   }
 
    