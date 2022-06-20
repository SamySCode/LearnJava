package SelfTaught;

public class Casting {
    public static void main(String[] args) {
        byte MyByte = 2; //byte variable being intialised
        byte MyNewByte = (byte) (MyByte/2); // this is called casting
        System.out.println(MyNewByte);
        // without (byte) java believes that MyByte is as default an int
        // we must then add (byte) to ensure java recognises the value as a byte in this equation
    }
}
