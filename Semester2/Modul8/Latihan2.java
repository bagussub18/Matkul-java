package Semester2.Modul8;
import java.util.Scanner;

public class Latihan2 {
    static void hitungmaxmin () {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Bilangan: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            System.out.println("Nilai Maksimal: "+b);
            System.out.println("Nilai Minimal: "+a);
        } else {
            System.out.println("Nilai Maksimal: "+a);
            System.out.println("Nilai Minimal: "+b);
        }
        in.close();
    }
    public static void main(String[] args) {
        hitungmaxmin();
    }
}
