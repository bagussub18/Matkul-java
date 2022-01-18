package Semester1.Modul9;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[]args) {
        Scanner sys = new Scanner(System.in);
        boolean status = true;
        int counter = 0;
        do {
            System.out.println("----------------------------------------");
            System.out.println("Universitas Teknologi Digital Indonesia");
            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.print("Cetak lagi [ya / tidak]: ");
            String pilihan = sys.nextLine();
            if (pilihan.equalsIgnoreCase("tidak")) {
                status = false;
            }
            counter++;
        } while(status);
        System.out.println("Cetak sebanyak: "+counter);
        sys.close();;
    }
}
