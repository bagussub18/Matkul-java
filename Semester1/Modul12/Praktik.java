package Semester1.Modul12;
import java.util.Scanner;

public class Praktik {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int angka = 0;
        System.out.print("Masukan angka (0 - 10) yang tidak ingin di cetak: ");
        int a = in.nextInt();
        while (angka <= 10) {
            if (a == angka) {
                angka++;
            }
            System.out.print(angka+" ");
            angka++;
        }
        in.close();
    }
}
