package Semester2.Modul8;
import java.util.Scanner;

public class Tugas {
    public static Scanner in = new Scanner(System.in);
    public static void identitas () {
        System.out.println("Nama:\tBagus");
        System.out.println("NIM:\t205410081");
        System.out.println("JeKel:\tL");
        System.out.println("Umur:\t21");
        System.out.println("Alamat:\tTemepel Wirogunan");
    }
    static void maxmin () {
        System.out.println("Masukan Bilangan: ");
        int a = in.nextInt();
        in.nextLine();
        int b = in.nextInt();
        in.nextLine();
        if (a < b) {
            System.out.println("Nilai Maksimal: "+b);
            System.out.println("Nilai Minimal: "+a);
        } else {
            System.out.println("Nilai Maksimal: "+a);
            System.out.println("Nilai Minimal: "+b);
        }
    }
    public static void cetak() {
        int a = 1;
        while (a <= 5) {
            System.out.println("UTDI");
            a++;
        }
    }
    public static void main(String[] args) {
        System.out.println("------------- MENU -------------");
        System.out.println("1. Identitas\n2. Cetak\n3. MaxMin ");
        System.out.println("--------------------------------");
        boolean status = true;
        while (status) {
            System.out.print("Pilih Menu: ");
            String pilih = in.nextLine();
            System.out.println("------------------------");
            if (pilih.equalsIgnoreCase("Identitas")) {
                identitas();
            } else {
                if (pilih.equalsIgnoreCase("Cetak")) {
                  cetak();
                } else {
                    if (pilih.equalsIgnoreCase("maxmin")) {
                        maxmin();
                    }
                }
            }
            System.out.println("------------------------");
            System.out.println("Cetak lagi? (ya / tidak) ");
            String jawab = in.nextLine();
            if (jawab.equalsIgnoreCase("ya")) {
                status = true;
            } else {
                status = false;
            }
        }
        in.close();
    }
}
