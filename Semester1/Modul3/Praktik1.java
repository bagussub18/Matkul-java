package Semester1.Modul3;
import java.util.Scanner;

public class Praktik1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Masukan Nilai B: ");
        int b = input.nextInt();
        System.out.print("Masukan Nilai C: ");
        int c = input.nextInt();
        System.out.print("Masukan Nilai D: ");
        int d = input.nextInt();

        b *= 2;
        a = b + c * d;
        System.out.println(" ");
        System.out.println("Bilai A: "+a);
        System.out.println(" ");

        //Latihan 2, Operator melibatkan 2 bilangan.
        int plus = c + d;
        int minus = c - d;
        int kali = c * d;
        int bagi = c / d;

        System.out.println("Penjumlahan Dua Bilangan: " +plus);
        System.out.println("Pengurangan Dua Bilangan: " +minus);
        System.out.println("Perkalian Dua Bilangan: " +kali);
        System.out.println("Pembagian Dua Bilangan: " +bagi);

        input.close();
    }
}
