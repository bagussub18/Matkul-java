package Semester1.Modul2;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        double panjang, lebar, luas;
        System.out.print("Masukan Panjang: ");
        panjang = sys.nextDouble();
        System.out.print("Masukan Lebar: ");
        lebar = sys.nextDouble();
        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang: " +luas);

        sys.close();
    }
}
