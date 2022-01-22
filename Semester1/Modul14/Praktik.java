package Semester1.Modul14;
import java.util.Scanner;

public class Praktik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float R = 0;
        System.out.print("Masukan banyak data: ");
        int banyak = in.nextInt();
        int [] r = new int [banyak];
        for (int a = 0; a < banyak; a++) {
            System.out.print("Maasukan nilai R" + (a + 1) + ": ");
            r[a] = in.nextInt();
            R = R + 1f / r[a];
        }
        R = 1 / R;
        System.out.println("R: "+R);
        R/=banyak;
        System.out.println("Rata - rata: "+R);
        in.close(); 
    }
}
