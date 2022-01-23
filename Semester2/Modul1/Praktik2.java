package Semester2.Modul1;
import java.util.Scanner;

public class Praktik2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diskon = 0;
        System.out.println("-------------------------------------");
        System.out.print("Masukan total belanjaan: ");
        int a = in.nextInt();
        in.nextLine();
        System.out.print("Apakah mempunyai kartu member: ");
        String b = in.nextLine(); 
        if (b.equalsIgnoreCase("ya")) {
            if (a > 500000) {
                diskon = 50000;
            } else {
                if (a > 100000) {
                    diskon = 15000;
                }
            }
        } else {
            if (b.equalsIgnoreCase("tidak")) {
                if (a > 100000) {
                    diskon = 5000;
                }
            }
        }
        int bayar = a - diskon;
        System.out.println("Total Bayar: Rp"+bayar);
        System.out.print("-------------------------------------");
        in.close();
    }
}
