package LearnJava.SelfTaught;
public class Variables {
    public static void main(String[] args) {
        //String and Int are made and printed
        String hello = "Hello"; //stores words or chars
        int num = 1; //stores a number
        System.out.println(hello + num);
        
        //You can also have other variable types

        double percent = 4.3; //stores a decimal value
        short small = 5; //only takes 2 bytes which saves memory
        byte smaller = 5; //even smaller and takes 1 byte
        long large = 5000000l; //can store a larger value at 8 bytes
        float decimal = 4.3f; //stores a decimal

        char var1 = 'A'; //stores one character
        System.out.println(percent + small + smaller + large + decimal + var1); // printing all to avoid warning from IDE

    }

}
