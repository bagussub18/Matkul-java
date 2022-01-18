package Semester1.Modul8;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        float jumlah = 0;
        System.out.print("Masukan banyak data: ");
        int data = in.nextInt();
        while (data >= 1) {
            a++;
            data--;
            System.out.print("Masukan data ke-" +a+ ": ");
            float nilai = in.nextFloat();
            jumlah = jumlah + nilai;
        }
        float ratarata = jumlah / a;
        System.out.println("Rata-rata: "+ratarata);
        System.out.println("Jumlah: "+jumlah);
        in.close();;
    }    
}
