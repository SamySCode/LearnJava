package LearnJava.SelfTaught;
public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Continue/Jump Statement");// title
        for (int j= 1; j<=10; j++){
            if(j == 5){ // the param is set
                continue; // with continue we can skip/jump past a number, in this case it is 5
            }
        System.out.println("value is" + " " + j); // j is not printed when j is equal to 5
        }
        
        System.out.println(" ");// adding spacing
        System.out.println(" ");
        System.out.println("Break Statement");// title
        
        for (int i= 1; i<=10; i++){
            if(i>5){// (if i is greater than 5)
                break; //with break it completely skips the rest of the loop when the param is met
            }
            System.out.println("value is" + " " + i); // this is skipped when i hits 5
        }
    }
    
}
