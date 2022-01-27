package Semester2.Modul4;
import java.util.Scanner;

public class Praktik2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] x = {{1, 2, 3}, {4, 5, 6}};
        int [][] y = {{3, 6, 1}, {4, 7, 9}};
        int kolom = 3;
        int baris = 2;
        System.out.println("Ini Adalah Matriks X");
        for (int b = 0; b < baris; b++) {
            for (int c = 0; c < kolom; c++) {
                System.out.print(x[b][c]+ " ");
            }
            System.out.println();
        }
        System.out.println("Ini Adalah Matriks Y");
        for (int b = 0; b < baris; b++) {
            for (int c = 0; c < kolom; c++) {
                System.out.print(y[b][c]+ " ");
            }
            System.out.println();
        }
        System.out.println("penjumlahan matriks x + y: ");
        for (int b = 0; b < baris; b++) {
            for (int c = 0; c < kolom; c++) {
                System.out.print(+(x[b][c]+y[b][c])+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
