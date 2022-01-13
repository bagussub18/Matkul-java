package Semester1.Modul6;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner tug = new Scanner(System.in);

        System.out.println("--------- Menghitung Luas? ---------");
        System.out.println("1. Persegi Panjang | 2. Lingkaran");
        System.out.println("------------------------------------");
        System.out.print("Pilih 1 atau 2: ");
        int pilihan = tug.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukan Panjang: ");
                int p = tug.nextInt();
                System.out.print("Masukan Lebar: ");
                int l = tug.nextInt();
                int luas = p * l;
                System.out.println("Luas Persegi Panjang: "+luas);
                break;
            case 2:
                System.out.print("Masukan jari-jari Lingkaran");
                float r = tug.nextFloat();
                float lingkaran = 3.14f * r * r;
                System.out.print("Luas Lingkaran: "+lingkaran);
                break;
            default:
                System.out.println("Salah Input");
                break;
        }

        tug.close();
    }
}
