package SelfTaught;
import java.util.Scanner;

public class IfElse {

    private static Scanner scan = new Scanner(System.in); // private to avoid warnings from IDE

    public static void main(String[] args) {
        //SWITCH CASE
        System.out.println("Input 1, 2 or 3. Only One Value Is Correct");
        int input = scan.nextInt(); // assigns int input variable with the input from the scanner1
        scan.nextLine();// makes a line for user to input
        switch (input) { // switch case takes the input and creates different cases depending on input
            case 1: // if user inputs 1 this will happen
                System.out.println("Wrong One, Try Again");
                break;
            case 2: // if user inputs 2 this will happen
                System.out.println("Correct!!! This is the right one");
                break;
            case 3: // if user inputs 3 this will happen
                System.out.println("Wrong One, Try Again");
                break;
            default: //works like an else statement
                System.out.println("Incorrect Input, should be 1, 2 or 3");
                break;
        }

        int big = 10;
        int small = 5;
        //IF ELSE STATEMENTS
        if (big > small) { // sets a parameter and if it is true it will do what is within the if
            System.out.println("big is bigger than small");
        } else if (small > big) { // else if also sets a parameter and works the same as an if, as long as the if
                                  // param isnt matched,
            System.out.println("Hmm why is small bigger than big.");
        } // you can also have a basic else statement that runs whenever the if statement
          // param is false

        //IF STATEMENTS WITH MULTIPLE CLAUSES
        int topScore = 80;
        int secondScore = 60;
        if(topScore > 100){
            System.out.println("You got the Top Score"); //comparing to topScore to 100 and printing phrase
        }
        else if((topScore > secondScore) && (topScore < 100)){
            System.out.println("You got higher than 2nd place!... but less than first");// multiple clauses for if you beat 2nd but get less than 1st
        }
    }
}
