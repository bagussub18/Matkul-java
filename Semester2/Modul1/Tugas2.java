package Semester2.Modul1;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Bulan ke - ");
        int a = in.nextInt();
        switch (a) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.print("Bulan ke - " +a+ ": 31 hari");
                break;
            case 2:
            System.out.print("Masukan tahun: ");
            int b = in.nextInt();
                if (b % 4 == 0) {
                    System.out.println("Bulan ke - " +a+ ": 29 hari");
                } else {
                    System.out.println("Bulan ke - " +a+ ": 28 hari");
                }
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Bulan ke - " +a+ ": 30 hari");
                break;
            default:
            System.out.println("Salah Input");
                break;
        }
        in.close();
    }
}
