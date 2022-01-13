package Semester1.Modul5;
import java.util.Scanner;

public class Praktik2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Angka: ");
        long angka = in.nextLong();
        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }

        in.close();
    }
}
