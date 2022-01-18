package Semester1.Modul9;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan = 1;
        int tambah = 3;
        System.out.print("Masukan banyak (n): ");
        int n = in.nextInt();
        do {
            System.out.println(bilangan);
            bilangan+=tambah;
            tambah+=2;
            n--;
        } while (1 <= n);
        in.close();
    }
}
