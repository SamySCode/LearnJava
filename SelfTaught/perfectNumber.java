package SelfTaught;

public class perfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
    }

    public static boolean isPerfectNumber(int number) {
        
        if(number > 0){
            int divisor = 0;
            for(int i = 1; i < number;i++){
                if(number%i == 0){
                    divisor = i + divisor;
                    if(divisor == number){
                        return true;
                    }
                    }else{
                        continue;
                    }
                }
            }
            return false;
    }
        
}
