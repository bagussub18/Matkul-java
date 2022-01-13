package Semester1.Modul5;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner tug2 = new Scanner(System.in);
        
        System.out.print("Masukan Sisi Kanan: ");
        int a = tug2.nextInt();
        System.out.print("Masukan Sisi Kiri: ");
        int b = tug2.nextInt();
        System.out.print("Masukan Sisi Bawah: ");
        int c = tug2.nextInt();
        System.out.print("Masukan Sudut Segitiga: ");
        int d = tug2.nextInt();
        if (a == b && a == c) {
            System.out.println("Segitiga Sama Sisi");
        } else {
            if (a != b && a != c && b != c && d == 90) {
                System.out.println("Segitiga Sama Siku-Siku");
            } else {
                if (a == b && a != c && b != c) {
                    System.out.println("Segitiga Sama Kaki");
                } else {
                    System.out.println("Tidak Dikenali");
                }
            }
        }

        tug2.close();
    }
}
