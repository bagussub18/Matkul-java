package Semester1.Modul8;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.print("Masukan Bilangan awal (Genap): ");
        int awal = sys.nextInt();
        System.out.print("Masukan Bilangan akhir: ");
        int akhir = sys.nextInt();
        while (awal <= akhir) {
            System.out.println(awal);
            awal+=2;
        }
        sys.close();;
    }
}
