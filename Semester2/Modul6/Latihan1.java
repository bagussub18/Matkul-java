package Semester2.Modul6;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        System.out.print("Cetak bilangan (Genap / Ganjil): ");
        String bil = in.nextLine();
        if (bil.equalsIgnoreCase("genap")) {
            while (a <= 10) {
                System.out.print(a+ " ");
                a+=2;
            }
            
        } else {
            if (bil.equalsIgnoreCase("ganjil")) {
                a = 1;
                while (a <= 10) {
                    System.out.print(a+ " ");
                    a+=2;
                }
            }
        }
        in.close();
    }
}
