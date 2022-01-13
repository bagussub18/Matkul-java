package Semester1.Modul6;
import java.util.Scanner;

public class Praktik3 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.print("Masukan Bulan Ke - ");
        byte bulan = sys.nextByte();
        switch (bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Bulan " +bulan+ " ini Bejumlah 31 hari");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Bulan " +bulan+ " ini Bejumlah 30 hari");
                break;
            case 2:
                System.out.println("Bulan " +bulan+ " ini Bejumlah 28 atau 29 hari");
                break;
            default:
                System.out.println("Salah Input Bulan.");
                break;
        }

        sys.close();
    }
}
