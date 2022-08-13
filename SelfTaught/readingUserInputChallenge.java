package SelfTaught;

import java.util.Scanner;

public class readingUserInputChallenge {
    public static void main(String[] args) {
        int number = 0;
        int input = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        while(number < 9){
            if(hasNextInt){
            number++;
            System.out.println("Enter Number #" + number);
            input = scanner.nextInt();
            sum = sum + input;
            }else{
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("Sum of inputs = " + sum);
        scanner.close();

    }

    
}
