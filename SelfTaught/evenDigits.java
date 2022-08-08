package SelfTaught;

public class evenDigits {
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
    }

    public static int getEvenDigitSum(int number) {
        int num = 0;
        int sum = 0;
        if(number >= 0){

                while(number!=0) {
                    num = number%10;
                    if(num % 2 == 0){
                    sum = sum + num;
                    number /= 10;
                    continue;
                    }
                    number /= 10;
                    continue;
                    }
                
                return sum;
        } 
        return -1;    
    }
}
    
