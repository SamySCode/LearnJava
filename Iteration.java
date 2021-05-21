public class Iteration {
    // while, do while, for, for-each loop
    public static void main(String[] args) {
        int i = 1;
        do { // does what is in bracket and while param is checked after
            System.out.println("Hello");
            i++;
        } while (i <= 5);// param checked after
                         // while loop would be this line of code with brackets after the while and would
                         // print 4 hellos instead of 5
                         // it would print 4 as it checks if its matches first before doing the loop

        for (int j = 1; j <= 5; j++) {  // for loop sets declaration,param and increment all on the same line
            for (int y = 1; y <= 4; y++) { // this is the concept of a nested loop
                System.out.println("Day" + y);
            }
            System.out.println("Friday!!!");
            // for each loop will be done in the arrays file later on
        }
    }
}
