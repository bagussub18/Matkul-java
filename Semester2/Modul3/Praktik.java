package Semester2.Modul3;
import java.util.Scanner;

public class Praktik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float data [] = new float[5];
        float total = 0, terbesar = 0, terkecil = 0;
        int b = 0, c = 0;
        for (int a = 0; a < 5; a++) {
            while (b < 5) {
                while (c < 5) {
                    System.out.print("Masukan Data ke - "+(c+1)+": ");
                    data[c] = in.nextFloat();
                    c++;
                }
                System.out.println("Data nilai ke - "+(b+1)+" yang dimasukan: "+data[b]);
                total = total + data[b];
                b++;
            }
            terkecil = data[0];
            for (int d = 0; d < 5; d++) {
                if (data[d] < terkecil) {
                    terkecil = data[d];
                }
                if (data[d] > terbesar) {
                    terbesar = data[d];
                }
            }
        }
        System.out.println("Total data: "+total);
        total/=5;
        System.out.println("Rata - rata: "+total);
        System.out.println("Data Terbesar: "+terbesar);
        System.out.println("Data Terkecil: "+terkecil);
        in.close();
    }
}
