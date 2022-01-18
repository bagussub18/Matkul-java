package Semester1.Modul10;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int awal = 0;
        System.out.print("MAsukan bilangan awal: ");
        awal = in.nextInt();
        System.out.print("Masukan bilangan akhir: ");
        int akhir = in.nextInt();
        for (int a = awal; a <= akhir; a+=5) {
            System.out.println(a);
        }
        in.close();
    }
}
