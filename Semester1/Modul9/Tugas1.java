package Semester1.Modul9;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        float jumlah = 0;
        int a = 0;
        System.out.print("Masukan banyaknya data: ");
        int banyak = in.nextInt();
        do {
            a++;
            System.out.print("Masukan data ke-" +a+ ": ");
            int data = in.nextInt();
            jumlah+=data;
            banyak--;
        } while (1 <= banyak);
        Float rerata = jumlah / a;
        System.out.println("Rata-rata: "+rerata);
        System.out.println("Jumlah: "+jumlah);
        in.close();
    }
}
