package Semester1.Modul7;
import java.util.Scanner;

public class Praktik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Anda (0 - 100): ");
        byte nilai = input.nextByte();
        if (nilai >= 60) {
            if (nilai >= 80) {
                System.out.println("Nilaimu Bagus Sekali");
            } else {
                System.out.println("Nilaimu Bagus");
            }
        } else {
            if (nilai >= 30) {
                System.out.println("Nilaimu Kurang");
            } else {
                if (nilai < 30) {
                    System.out.println("Nilaimu Jelek");
                } else {
                    System.out.println("Salah Input Nilai");
                }
            }
        }

        input.close();
    }
}
