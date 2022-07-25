package SelfTaught;

public class MegaBytesConverter {
    public static void main(String[] args) {
        int kiloBytes = 2500;
        printMegaBytesAndKiloBytes(kiloBytes);
        
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes > 0){
            int megaBytes = kiloBytes / 1024;
            int remainderkiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = "  + megaBytes + "MB and " + remainderkiloBytes + "KB");
        } else{
            System.out.println("Invalid Value");
        }
    } 

    
}

