package Semester1.Modul6;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner lat = new Scanner(System.in);

        System.out.print("Masukan Bulan ke - ");
        byte bulan = lat.nextByte();
        if ((bulan % 2 == 1 && bulan >= 1 && bulan < 8) || (bulan % 2 == 0 && bulan >= 8 && bulan <= 12)) {
            System.out.println("Bulan " +bulan+ " ini Bejumlah 31 hari");
        } else {
            if (bulan % 2 == 0 && bulan >= 4 && bulan <= 6 || bulan % 2 == 1 && bulan > 6 && bulan <= 12) {
                System.out.println("Bulan " +bulan+ " ini Bejumlah 30 hari");
            } else {
                if (bulan == 2) {
                    System.out.println("Bulan " +bulan+ " ini Bejumlah 28 atau 29 hari");
                } else {
                    System.out.println("Salah Input Bulan");
                }
            }
        }

        lat.close();
    }
}
