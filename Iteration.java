public class Iteration {
    // while, do while, for, for-each loop
    public static void main(String[] args) {
        int i = 1;
        do { // does what is in bracket and while param is checked after
            System.out.println("Hello");
            i++;
        } while (i <= 5);// param checked after
                         //  while loop would be this line of code with brackets after the while and would print 4 hellos instead of 5
                         // it would print 4 as it checks if its matches first before doing the loop

        for (int y = 1; y <= 5; y++) { // for loop sets declaration,param and increment all on the same line
            System.out.println("Bye");
        }
        // for each loop will be done in the arrays file later on

    }
}
