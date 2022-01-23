package Semester2.Modul1;
import java.util.Scanner;

public class Praktik1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int terbesar = 0;
        int terkecil = 0;
        System.out.print("Masukan nilai 1: ");
        int a = in.nextInt();
        System.out.print("Masukan nilai 2: ");
        int b = in.nextInt();
        System.out.print("Masukan nilai 3: ");
        int c = in.nextInt();
        if (a > b & a > c) {
            if (b > c) {
                terbesar = a;
                terkecil = c;
            } else {
                terbesar = a;
                terkecil = b;
            }
        } else {
            if (b > c & b > a) {
                if (c < a) {
                    terbesar = b;
                    terkecil = a;
                } else {
                    terbesar = b;
                    terkecil = c;
                }
            } else {
                if (c > a & c > b) {
                    if (a > b) {
                        terbesar = c;
                        terkecil = b;
                    } else {
                        terbesar = c;
                        terkecil = a;
                    }
                }
            }
        }
        System.out.println("Terbesar: "+terbesar);
        System.out.println("Terkecil: "+terkecil);
        in.close();
    }
}
