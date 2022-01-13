package Semester1.Modul3;
import java.util.Scanner;

public class Praktik2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Bilangan 1: ");
        int bil1 = in.nextInt();
        System.out.print("Masukan Bilangan 2: ");
        int bil2 = in.nextInt();
        int hasil = bil1 % bil2;
        System.out.println(hasil);

        in.close();;
    }
}
