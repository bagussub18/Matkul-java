package Semester1.Modul10;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int awal = 0;
        int j = 0;
        System.out.print("Masukan bilangan awal: ");
        awal = in.nextInt();
        System.out.print("Masukan bilangan akhir: ");
        int akhir = in.nextInt();
        for (int a = awal; a <= akhir; a+=5) {
            System.out.print(a+" ");
            j+=a;
        }
        System.out.println("");
        System.out.println("Jumlah: "+j);
        in.close();
    }
}
